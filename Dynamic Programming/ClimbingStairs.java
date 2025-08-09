// package Dynamic Programming;
import java.util.*;

public class ClimbingStairs {

    // Tle
    // public static void main(String[] args) {
    //     Scanner sc =  new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(find(n));
    // }
    // public static int find(int n) {
    //     if(n == 0) return 1;
    //     if(n < 0) return 0;

    //     return find(n-1) + find(n-2);
    // }

    

    // using Memoization
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n =  sc.nextInt();
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp, -1);
    //     System.out.println(find(n, dp));
    // }
    // public static int find(int n, int dp[]) {
    //     if(n == 0) return 1;
    //     if(n < 0) return 0;

    //     if(dp[n] != -1) return dp[n];

    //     return dp[n] = find(n-1, dp) + find(n-2, dp);
    // }

    
    // Tabulation 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dp[] = new int[n+1];
        dp[0] = 1; dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}


// Similar question: minimum cost to reach at the top