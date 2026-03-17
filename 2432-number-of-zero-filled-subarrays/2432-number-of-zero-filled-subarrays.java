class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
                if (i == nums.length - 1) {
                    ans += (long)n * (n + 1) / 2;
                }
            } else {
                ans += (long)n * (n + 1) / 2;
                n = 0;
            }
        }
        return ans;
    }
}