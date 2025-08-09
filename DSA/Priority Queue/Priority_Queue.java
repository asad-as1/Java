import java.util.*;
public class Priority_Queue {
    ArrayList<Integer> data = new ArrayList<>();

    public void addEle(int val) {
        data.add(val);
        upheapify(data.size()-1);
    }

    public void upheapify(int ci) {
        int pi = (ci-1)/2;  // (-1 / 2) = -0.5 = 0

        // if(ci == pi) return;
        if(data.get(pi) < data.get(ci)) {
            swap(ci, pi);
            upheapify(pi);
        }
    }

    public void downheapify(int pi) {
        int idx = pi;
        int lci = 2*pi + 1;
        int rci = 2*pi + 2;
        if(lci < data.size() && data.get(lci) > data.get(pi)) {
            idx = lci;
        }
        if(rci < data.size() && data.get(rci) > data.get(idx)) {
           idx = rci;
        }

        if(idx != pi) {
            swap(idx, pi);
            downheapify(idx);
        }
    }

    public void swap(int ci, int pi) {
        int child = data.get(ci);
        int parent = data.get(pi);
        data.set(pi, child);
        data.set(ci, parent);
    }

    public int get() {
        int value = data.get(0);
        return value;
    }
    public void max() {
        int value = data.get(0);
        data.set(0, data.get(data.size()-1));
        
        downheapify(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Priority_Queue pq = new Priority_Queue();
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            pq.data.add(sc.nextInt());
            pq.upheapify(i);
        }
        System.out .println(pq.data);
        System.out.println(pq.get());
        
    }
}