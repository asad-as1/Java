//  graph should be directed acyclic graph (DAG) to apply Top Sort


import java.util.ArrayList;
import java.util.Stack;

public class TopSort {
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

        // Directed Acyclic Graph (DAG)
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 4, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 1));

    }

    public static void topSort() {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(i, vis, s);  // modified dfs
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");   // 0 1 3 2 4 5
        }
    } 

    public static void topSortUtil(int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        create(6);
        topSort();
    }
}
