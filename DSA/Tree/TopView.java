import java.util.*;
class TopView {

    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {

        // Base case: if the tree is empty, return an empty
        // list
        if (root == null) {
            return new ArrayList<>();
        }

        // Queue to perform level order traversal.
        // Each element in the queue is a pair of (Node,
        // horizontal distance)
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        // HashMap to store the first node at each
        // horizontal distance
        HashMap<Integer, Integer> map = new HashMap<>();

        // Variables to track the minimum and maximum
        // horizontal distances
        int minHD = 0;
        int maxHD = 0;
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node currentNode = current.node;
            int hd = current.dist;

            // Update min and max horizontal distances
            if (hd < minHD) {
                minHD = hd;
            }
            if (hd > maxHD) {
                maxHD = hd;
            }

            // If a horizontal distance is encountered for
            // the first time, add it to the map
            if (!map.containsKey(hd)) {
                map.put(hd, currentNode.data);
            }

            // Enqueue the left child with horizontal
            // distance hd - 1
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, hd - 1));
            }

            // Enqueue the right child with horizontal
            // distance hd + 1
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, hd + 1));
            }
        }

        // Prepare the result list by traversing from minHD
        // to maxHD
        ArrayList<Integer> topViewList = new ArrayList<>();
        for (int hd = minHD; hd <= maxHD; hd++) {
            if (map.containsKey(hd)) {
                topViewList.add(map.get(hd));
            }
        }
        return topViewList;
    }

    // Helper class to store a node along with its
    // horizontal distance
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
}