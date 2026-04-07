class Solution {
    public int numIdenticalPairs(int[] nums) {
        //frequency counting with math
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int pairs = 0;
        for (int k : freq) {
            pairs += k * (k - 1) / 2;
        }
        return pairs;
    }
}