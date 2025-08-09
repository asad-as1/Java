import java.util.*;
// Prims Algo.

public class Dijkastra {
    HashMap<Integer, HashMap<Integer, Integer>> graph;

    public Dijkastra(int v) {
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

    class pair {
        int vtx;
        String path;
        int cost;
        pair (int vtx, String path, int cost) {
            this.vtx = vtx;
            this.path = path;
            this.cost = cost;
        }

        public String toString() {
            return vtx + " " + path + " " + cost;
        }
    }

    public void Dijkastra() { // Minimum spanninf tree

        PriorityQueue<pair> pq = new PriorityQueue<pair>(new Comparator<pair>() {
            public int compare(pair o1, pair o2) {
                return o1.cost - o2.cost;
            }
        });

        HashSet<Integer> visited = new HashSet<>();

        pair pp = new pair(1, "1", 0);
        pq.add(pp);

        while (!pq.isEmpty()) {
            pair rv = pq.remove();
            if (visited.contains(rv.vtx)) continue;
                
            visited.add(rv.vtx);
            System.out.println(rv);


            for (int k : graph.get(rv.vtx).keySet()) {
                pair pa = new pair(k, rv.path+k, graph.get(rv.vtx).get(k));
                pq.add(pa);
            }
        }
        // System.out.println("Minimum cost : " + ans);
    }

    public static void main(String[] args) {
        Dijkastra gh = new Dijkastra(3);
        gh.addEdge(1, 2, 3);
        gh.addEdge(1, 3, 4);
        // gh.addEdge(1, 4, 30);
        gh.addEdge(2, 3, -5);
        // gh.addEdge(3, 4, 35);

        gh.Dijkastra();
    }
}
