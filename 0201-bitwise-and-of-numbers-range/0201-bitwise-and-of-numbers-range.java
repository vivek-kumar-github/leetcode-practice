class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //using bit shift, common prefix of bits
        int shifts = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        return left << shifts;
    }
}