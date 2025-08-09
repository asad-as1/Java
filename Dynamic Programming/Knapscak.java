// package Dynamic Programming;

// import java.util.*;
public class Knapscak {

    // tle
    // public static void main(String args[]) {
    //     int val[] = {15, 14, 10, 45, 30};
    //     int wt[] = {2, 5, 1, 3, 4};
    //     int w = 7;     //(capacity of a bag)
    //     // 75 (max profit)

    //     System.out.println(find(val, wt, w, wt.length-1));
    // }
    // public static int find(int val[], int wt[], int w, int n) {
    //     if(n == 0 || w == 0) return 0;
           
    //     int a = 0;
    //     if(w >= wt[n]) {
    //         int a = val[n] + find(val, wt, w-wt[n], n-1);
    //     }
    //     int b = find(val, wt, w, n-1);
    //     return Math.max(a, b);
    // }


    // Memoization (two variable are changing so we will use 2d array)
    // public static void main(String[] args) {
    //     int val[] = {15, 14, 10, 45, 30};
    //     int wt[] = {2, 5, 1, 3, 4};
    //     int w = 7, n = wt.length;
    //     int dp[][] = new int[n+1][w+1];

    //     // for(int i=0; i<=n; i++) Arrays.fill(dp[i], -1);

    //     System.out.println(find(val, wt, w, dp, n-1));
    // }

    // public static int find(int val[], int wt[], int w, int dp[][], int n) {
    //     if (n == 0 || w == 0) return 0;
    
    //     if (dp[n][w] != -1) return dp[n][w];
    
    //     if (wt[n - 1] > w) {
    //         return dp[n][w] = find(val, wt, w, dp, n - 1);
    //     }
    
    //     int exclude = find(val, wt, w, dp, n - 1);
    //     int include = val[n - 1] + find(val, wt, w - wt[n - 1], dp, n - 1);
    
    //     // Store and return the maximum value
    //     return dp[n][w] = Math.max(exclude, include);
    // }
    
  
    // Tabulation(doubt)
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7, n = wt.length;
        int dp[][] = new int[n+1][w+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=w; j++) {
                int v = val[i-1];
                int we = wt[i-1];  //doubt
                if(we <= j) { 
                    int incProfit = v + dp[i-1][j-we]; //doubt
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }
                else {
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
