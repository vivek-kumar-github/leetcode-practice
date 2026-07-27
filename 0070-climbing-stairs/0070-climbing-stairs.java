class Solution {
    public int  rec(int i, int[] dp, int n) {
        if (i == n) return 1;
        if (dp[i] != -1) return dp[i];
        int ways = 0;
        if (i + 1 <= n) ways += rec(i + 1, dp, n);
        if (i + 2 <= n) ways += rec(i + 2, dp, n);
        return dp[i] = ways;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return rec(0, dp, n);
    }
}