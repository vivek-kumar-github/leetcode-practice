class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        if ((sum & 1) != 0) return false;
        int tar = sum / 2;
        int n = nums.length;
        int[][] dp = new int[n + 1][tar + 1];
        dp[n][0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= tar; j++) {
                dp[i][j] = dp[i + 1][j];
                if (nums[i] <= j) dp[i][j] |= dp[i + 1][j - nums[i]];
            }
        }
        return dp[0][tar] == 1 ? true : false; 
    }
}