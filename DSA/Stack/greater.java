import java.util.*;
public class greater {

    public static void main(String[] args) {
        int a[] = {1,3,2,10,4,5};
        int n = a.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        
        // for(int i=0; i<n; i++) {
        //     while(!s.isEmpty() && a[i] > a[s.peek()]) {
        //         ans[s.pop()] = a[i];
        //     }
        //     s.push(i);
        // }

        // while(!s.isEmpty()) {
        //     ans[s.pop()] = -1;
        // }


        for(int i = n-1; i>=0; i--) {
            while(!s.isEmpty() && a[i] > s.peek()) {
                s.pop();
            }

            if(!s.isEmpty()) ans[i] = s.peek();
            else ans[i] = -1;

            s.push(a[i]);
            }
        System.out.println(Arrays.toString(ans));
    }
}