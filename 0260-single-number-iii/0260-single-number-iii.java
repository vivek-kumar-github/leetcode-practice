class Solution {
    public int[] singleNumber(int[] nums) {
        //using bit manipulation XOR
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        int diffBit = xorAll & (-xorAll);
        int x = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                x ^= num;
            }
        }
        return new int[] {x, x ^ xorAll};
    }
}