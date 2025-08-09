// Hard Category question

import java.util.*;

public class MatrixChainMultiplication {

    public static int find(int a[], int i, int j, int dp[][]) {
        if (i == j) return 0; // Single matrix
        if (dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = find(a, i, k, dp); // A1 (A X B)
            int cost2 = find(a, k + 1, j, dp); // B1 (C X D)
            int cost3 = a[i - 1] * a[k] * a[j]; // C1 (A1 X B1) a * b * d (size of two matrix A and B)
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp[i][j] = ans;
    }
                                     // For multiplication b == c should be there
    public static void main(String[] args) {         //  a X b,     c X d,     e X f      g X h
        int a[] = { 1, 2, 3, 4, 3 }; // size of mat, A = 1 X 2, B = 2 X 3, C = 3 X 4, D = 4 X 3
        int n = a.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        System.out.println(find(a, 1, n - 1, dp));
    }


    // Tabulation  (different) doubt
    // public static void main(String[] args) {
    //     int a[] = { 1, 2, 3, 4, 3 };
    //     int n = a.length;
    //     int dp[][] = new int[n][n];

    //     for(int len=2; len<n; len++) {
    //         for(int i=1; i<=n-len; i++) {
    //             int j = i + len - 1;  // col
    //             dp[i][j] = Integer.MAX_VALUE;
    //             for(int k=i; k<=j-1; k++) {
    //                 int cost1 = dp[i][k];
    //                 int cost2 = dp[k+1][j];
    //                 int cost3 = a[i-1] * a[k] * a[j];
    //                 dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
    //             }
    //         }
    //     }

    //     System.out.println(dp[1][n-1]);
    // }
}