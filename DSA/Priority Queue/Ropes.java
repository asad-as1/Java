import java.util.*;
public class Ropes {
    public static void main(String[] args) {
        long arr[] = {4, 3, 2, 6};
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }

        long ans = 0;
        while(pq.size() != 1) {
            long sum = 0;
            if(!pq.isEmpty()) sum += pq.poll();
            if(!pq.isEmpty()) sum += pq.poll();
            pq.add(sum);
            ans += sum;
        }
        System.out.println(ans);
    }
}