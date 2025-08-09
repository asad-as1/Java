import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class SpanningTree {

    HashMap<Integer, HashMap<Integer, Integer>> graph;

    public SpanningTree(int v) {
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
        int parent;
        int cost;
        pair (int vtx, int parent, int cost) {
            this.vtx = vtx;
            this.parent = parent;
            this.cost = cost;
        }

        public String toString() {
            return vtx + " " + parent + " " + cost;
        }
    }

    public void MST() { // Minimum spanninf tree
        int ans = 0;

        PriorityQueue<pair> pq = new PriorityQueue<pair>(new Comparator<pair>() {
            public int compare(pair o1, pair o2) {
                return o1.cost - o2.cost;
            }
        });

        HashSet<Integer> visited = new HashSet<>();

        pair pp = new pair(1, 1, 0);
        pq.add(pp);

        while (!pq.isEmpty()) {
            pair rv = pq.remove();
            if (visited.contains(rv.vtx)) continue;
                
            visited.add(rv.vtx);
            System.out.println(rv);

            ans += rv.cost;

            for (int k : graph.get(rv.vtx).keySet()) {
                pair pa = new pair(k, rv.vtx, graph.get(rv.vtx).get(k));
                pq.add(pa);
            }
        }
        System.out.println("Minimum cost : " + ans);
    }

    public static void main(String[] args) {
        SpanningTree gh = new SpanningTree(4);
        gh.addEdge(1, 2, 10);
        gh.addEdge(1, 4, 5);
        gh.addEdge(2, 3, 15);
        gh.addEdge(3, 4, 35);

        gh.MST();
    }
}
