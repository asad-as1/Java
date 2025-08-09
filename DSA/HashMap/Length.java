import java.util.*;
public class Length {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {2, 3, 2, 1, 1, 1, 5, 9, 3, 2, 1}, k = 5;
        // int a[] = {0, 0, 0, 0, 0, 0}, k = 0;
        // int a[] = {1,2,3}, k = 3;
        
        int sum = 0, l = 0, n = a.length;
        for(int i=0; i<n; i++) {
            sum += a[i];
            if(sum == k) {
                l = i + 1;
            }
            if(map.containsKey(sum - k)) {
                int s = map.get(sum - k) + 1;
                l = Math.max(l, (i - s + 1));
            }
            map.put(sum, i);
        }
        System.out.println("max length : " +  l);
    }
}