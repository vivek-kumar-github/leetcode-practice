class Solution {
    public int removeDuplicates(int[] nums) {
        int writePos = 0;
        int k = 0;
        int prev = -101;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[writePos++] = nums[i];
                k++;
                prev = nums[i];
            }
        }
        return k;
    }
}