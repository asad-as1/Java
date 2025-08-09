import java.util.ArrayList;
import java.util.HashMap;

public class DisjointSet {

    private HashMap<Integer, Node> map = new HashMap<>();

    public class Node {
        int val;
        int rank;
        Node parent;

        public Node(int val) {
            this.val = val;
            this.rank = 0;
            this.parent = this;  // Self-parent initially
        }
    }

    // Create a new set with a single element
    public void create(int val) {
        Node node = new Node(val);
        map.put(val, node);
    }

    // Find the representative of the set with path compression
    public Node findparent(Node node) {
        if (node.parent != node) {
            node.parent = findparent(node.parent); // Path Compression
        }
        return node.parent;
    }

    public int findparent(int val) {
        Node node = map.get(val);
        return findparent(node).val;
    }

    // Union of two sets
    public void union(int val1, int val2) {
        Node node1 = map.get(val1);
        Node node2 = map.get(val2);

        Node root1 = findparent(node1);
        Node root2 = findparent(node2);

        if (root1 == root2) {
            return; // Already in the same set
        }

        // Union by rank
        if (root1.rank > root2.rank) {
            root2.parent = root1;
        } else if (root1.rank < root2.rank) {
            root1.parent = root2;
        } else {
            root2.parent = root1;
            root1.rank++;
        }
    }

    // Example edge pair class
    public static class EdgePair {
        int v1;
        int v2;
        int cost;

        public EdgePair(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Edge(" + v1 + ", " + v2 + ") with cost: " + cost;
        }
    }

    // Example method to get all edges (dummy example)
    public ArrayList<EdgePair> allEdgePairs() {
        // Normally, you would get this list from actual data
        ArrayList<EdgePair> list = new ArrayList<>();
        list.add(new EdgePair(1, 2, 4));
        list.add(new EdgePair(2, 3, 3));
        list.add(new EdgePair(1, 3, 5));
        return list;
    }

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet();

        // Example of adding nodes
        for (int k = 1; k <= 3; k++) {
            ds.create(k);
        }

        ArrayList<EdgePair> list = ds.allEdgePairs();
        int ans = 0;

        for (EdgePair edge : list) {
            int v1 = edge.v1;
            int v2 = edge.v2;

            int root1 = ds.findparent(v1);
            int root2 = ds.findparent(v2);

            if (root1 != root2) {
                System.out.println(edge);
                ans += edge.cost;
                ds.union(v1, v2);
            }
        }

        System.out.println("Total cost of minimum spanning tree: " + ans);
    }
}
