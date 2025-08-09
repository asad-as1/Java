import java.util.*;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> graph;

    public Graph(int v) {
        graph = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            graph.put(i, new HashMap<Integer, Integer>());
        }
    }

    public void addEdge(int v1, int v2, int w) {
        if (!graph.containsKey(v1) || !graph.containsKey(v2))
            return; // Check if vertices exist
        graph.get(v1).put(v2, w);
        graph.get(v2).put(v1, w);
    }

    public void print() {
        for (int a : graph.keySet()) {
            for (int neighbor : graph.get(a).keySet()) {
                if (a < neighbor) {
                    System.out.println(a + " -> " + neighbor + " (weight: " + graph.get(a).get(neighbor) + ")");
                }
            }
        }
    }

    public void removeEdge(int v1, int v2) {
        if (graph.containsKey(v1) && graph.containsKey(v2)) {
            graph.get(v1).remove(v2);
            graph.get(v2).remove(v1);
        }
    }

    public boolean hasVertex(int v) {
        return graph.containsKey(v);
    }

    public boolean hasEdge(int v1, int v2) {
        return graph.get(v1).containsKey(v2) && graph.get(v2).containsKey(v1);
    }

    public void removeVertex(int v) {
        if (!graph.containsKey(v))
            return;
        for (int k : graph.get(v).keySet()) {
            graph.get(k).remove(v);
        }
        graph.remove(v);
    }

    public boolean findPath(int v1, int v2) {
        HashSet<Integer> visited = new HashSet<>();
        return findPath(v1, v2, visited);
    }

    private boolean findPath(int v1, int v2, HashSet<Integer> visited) {
        if (v1 == v2)
            return true;
        visited.add(v1);

        for (int a : graph.get(v1).keySet()) {
            if (!visited.contains(a)) {
                if (findPath(a, v2, visited))
                    return true;
            }
        }
        return false;
    }

    public void allPaths(int v1, int v2, String ans, HashSet<Integer> set) {
        if (v1 == v2) {
            System.out.println(ans + " " + v2);
            return;
        }
        set.add(v1);
        for (int a : graph.get(v1).keySet()) {
            if (!set.contains(a)) {
                allPaths(a, v2, ans + " " + v1, set);
            }
        }
        set.remove(v1);
    }

    public void BFS(int v1) {
        HashSet<Integer> visited = new HashSet<>();
        BFS(v1, visited);
    }

    private void BFS(int v, HashSet<Integer> visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited.add(v);

        while (!q.isEmpty()) {
            int rv = q.poll();
            // System.out.println(rv);

            for (int k : graph.get(rv).keySet()) {
                if (!visited.contains(k)) {
                    q.add(k);
                    visited.add(k);
                }
            }
        }
    }

    public void DFS(int v1) {
        HashSet<Integer> visited = new HashSet<>();
        DFS(v1, visited);
    }

    private void DFS(int v, HashSet<Integer> visited) {
        Stack<Integer> st = new Stack<>();
        st.add(v);

        while (!st.isEmpty()) {
            int rv = st.pop();
            if (visited.contains(rv)) continue;
            visited.add(rv);
            System.out.println(rv);

            for (int k : graph.get(rv).keySet()) {
                if (!visited.contains(k)) {
                    st.push(k);
                }
            }
        }
    }

    public int numberOfComponent() {
        HashSet<Integer> visited = new HashSet<>();
        int componentCount = 0;

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                BFS(vertex, visited);
                componentCount++;
            }
        }
        return componentCount;
    }

    public boolean hasCycle() {
        HashSet<Integer> visited = new HashSet<>();
        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                BFS(vertex, visited);
            }
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Graph gp = new Graph(10);

        gp.addEdge(1, 2, 10);
        gp.addEdge(1, 4, 20);
        gp.addEdge(2, 3, 15);
        gp.addEdge(2, 1, 10);
        // gp.addEdge(2, 5, 5);
        gp.addEdge(3, 2, 25);
        gp.addEdge(3, 4, 25);
        gp.addEdge(4, 1, 12);
        gp.addEdge(4, 3, 12);
        gp.addEdge(5, 6, 10);
        gp.addEdge(6, 7, 13);

        // System.out.println("Graph edges:");
        // gp.print();

        // System.out.println("\nAll paths from 1 to 7:");
        // gp.allPaths(1, 7, "", set);

        // System.out.println("\nBFS starting from vertex 1:");
        // gp.BFS(1);

        // System.out.println("\nDFS starting from vertex 1:");
        // gp.DFS(1);

        // System.out.println("\nNumber of connected components:");
        // System.out.println(gp.numberOfComponent());

        System.out.print("Cycle or Not: ");
        System.out.println(gp.hasCycle());
    }
}
