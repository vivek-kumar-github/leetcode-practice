class Solution {
    public int rec(int i, int n, int[] dp, int[] nums) {
        if (i >= n) return 0;
        if (dp[i] != -1) return dp[i];
        int profit = 0;
        profit = nums[i] + rec(i + 2, n, dp, nums);
        profit = Math.max(profit, rec(i + 1, n, dp, nums));
        return dp[i] = profit;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        rec(0, n, dp, nums);
        return dp[0];
    }
}