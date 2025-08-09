// Array of ArrayList<Edge> type

import java.util.*;
public class Graph1 {
    static ArrayList<Edge> graph[];  // global
    
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

        for(int i=0; i<v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void neighbours(int n) {
        for(int i=0; i<graph[n].size(); i++) {
            Edge e = graph[n].get(i); // src, dest, wt
            System.out.println(e.dest);
        }
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.poll();

            if(!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        create(5);

        // 2's neighbours
        // neighbours(2);

        // bfs();

        // boolean vis[] = new boolean[graph.length];

        dfs(0, new boolean [graph.length]);
        bfs();
    }
}