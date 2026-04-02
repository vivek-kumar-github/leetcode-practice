class Solution {
    //follow up:- if function is called millions of times
    private static final int[] TABLE = new int[256];
    static {
        for (int i = 0; i < 256; i++) {
            int reversed = 0, val = i;
            for (int j = 0; j < 8; j++) {
                reversed = (reversed << 1) | (val & 1);
                val >>= 1;
            }
            TABLE[i] = reversed;
        }
    }
    public int reverseBits(int n) {
        return (TABLE[n & 0xFF] << 24)
        | (TABLE[(n >> 8) & 0xFF] << 16)
        | (TABLE[(n >> 16) & 0xFF] << 8)
        | (TABLE[(n >> 24) & 0xFF]);
    }
}