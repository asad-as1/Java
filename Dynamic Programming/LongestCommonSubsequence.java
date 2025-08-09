public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "ABC", s2 = "ACD";
        int n = s1.length(), m = s2.length();
        int dp[][] = new int[n+1][m+1];
        String ans = "";

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    ans += s1.charAt(i-1);
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        // System.out.println(dp[n][m]);
        System.out.println(ans);
    }
}
