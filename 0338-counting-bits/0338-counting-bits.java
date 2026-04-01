class Solution {
    public int[] countBits(int n) {
        //using DP with last set bit Brian Kernighan's trick
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        return ans;
    }
}