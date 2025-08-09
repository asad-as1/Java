import java.util.*;

class BottomView {

    static ArrayList<Integer> bottomView(Node root) {

        if (root == null) {
            return new ArrayList<>();
        }

       
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        HashMap<Integer, Integer> map = new HashMap<>();

        int minHD = 0;
        int maxHD = 0;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node currentNode = current.node;
            int hd = current.dist;

            if (hd < minHD) minHD = hd;
            if (hd > maxHD) maxHD = hd;

            // Always update the map    main differnce btw top and bottom view 
            map.put(hd, currentNode.data);

            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, hd - 1));
            }

            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, hd + 1));
            }
        }

        ArrayList<Integer> bottomViewList = new ArrayList<>();
        for (int hd = minHD; hd <= maxHD; hd++) {
            if (map.containsKey(hd)) {
                bottomViewList.add(map.get(hd));
            }
        }
        return bottomViewList;
    }

    static class Pair {
        Node node;
        int dist;

        Pair(Node node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Example usage
    public static void main(String[] args) {
        /*
                20
               /  \
             8     22
            / \      \
           5   3     25
              / \
             10 14
        */
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> result = bottomView(root);
        System.out.println("Bottom view of the binary tree: " + result);
        // Output: [5, 10, 3, 14, 25]
    }
}
