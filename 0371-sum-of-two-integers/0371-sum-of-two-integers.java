class Solution {
    public int getSum(int a, int b) {
        //using bit manipulation XOR + AND + Shift
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}