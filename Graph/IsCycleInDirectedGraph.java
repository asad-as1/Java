// Detect cycle in Directed Graph

import java.util.ArrayList;

public class IsCycleInDirectedGraph {
    static ArrayList<Edge> graph[]; // global
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void create(int v) {

        // int a[] = new int[5];
        // ArrayList<Edge> [] graph = new ArrayList[v];

        graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph contains cycle
        // graph[0].add(new Edge(0, 1, 1));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[3].add(new Edge(3, 1, 1)); // Cycle: 1 → 2 → 3 → 1
        // graph[4].add(new Edge(4, 2, 1));

        // Graph does not contain cycle
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 4, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 1));
    }

    public static boolean isCycle(int curr) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(curr, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // dfs
    public static boolean isCycleUtil(int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) { // cycle
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        // create(5);
        create(6);
        System.out.println(isCycle(0));
    }
}