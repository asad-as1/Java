import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        // System.out.println(fibo(n)); 

        // memo(n, dp);
        // System.out.println(Arrays.toString(dp));

        tabulation(n, dp);
        System.out.println(Arrays.toString(dp));
    }


    // Recur
    private static int fibo(int n) {
        if(n == 0 || n == 1) return 1;

        int a = fibo(n-1);
        int b = fibo(n-2);
        return a + b;
    }

    // Memoization
    private static int memo(int n, int dp[]) {
        if(n == 0 || n == 1) return dp[n] = n;

        if(dp[n] != -1) return dp[n];

        int a = memo(n-1, dp);
        int b = memo(n-2, dp);
        return dp[n] = a + b;
    }

    //  Tabulation
    private static void tabulation(int n, int dp[]) {
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
    
}