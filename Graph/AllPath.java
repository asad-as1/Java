// All path in a directed graph

import java.util.ArrayList;

public class AllPath {
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

    public static void allPath(int src, int dest, String path) {
        if(src == dest) {
            System.out.println(path);
            return;
        }
        for(Edge el: graph[src]) {
            allPath(el.dest, dest, path + " " + el.dest);

        }
    } 
    public static void main(String[] args) {
        create(6);
        allPath(0, 5, "0");
    }
}