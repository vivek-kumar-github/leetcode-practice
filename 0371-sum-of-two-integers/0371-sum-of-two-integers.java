class Solution {
    public int getSum(int a, int b) {
        //using successive increment/decrement
        while (b > 0) {
            a = -~a;
            b = ~-b;
        }
        while (b < 0) {
            a = ~-a;
            b = -~b;
        }
        return a;
    }
}