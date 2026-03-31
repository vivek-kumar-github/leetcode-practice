class Solution {
    public int singleNumber(int[] nums) {
        //using bit manipulation
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}