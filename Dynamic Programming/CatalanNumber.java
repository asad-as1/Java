//  Catalan number = (C0 * Cn-1) + (C1 * Cn-2) + (C2 * Cn-3) + ....
// C0 = 1, C1 = 1  (given)

import java.util.*;

public class CatalanNumber {

    // Memoization
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int dp[] = new int[n+1];
    // Arrays.fill(dp, -1);
    // System.out.println(find(dp, n));
    // sc.close();
    // }
    // public static int find(int dp[], int n) {
    // if(n == 0 || n == 1) return 1;

    // if(dp[n] != -1) return dp[n]; // if(dp[n] != 0) it is also valid

    // int ans = 0;
    // for(int i=0; i<n; i++) {
    // ans += (find(dp, i) * find(dp, n-i-1));
    // }
    // return dp[n] = ans;
    // }

    // Tabulation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(dp[n]);
    }
}

// Similar question :
// 1. Count BST n is given or array on length n is given count total no. ways in
// which valid no. of bst can form

// 2. Mountain ranges in which upstrokes and downstrokes is given, count the
// total no. of ways in which valid mountains can form