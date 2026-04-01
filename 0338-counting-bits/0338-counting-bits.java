class Solution {
    public int[] countBits(int n) {
        //using brian kernighan algo
        int[] table = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            table[i] = brian(i);
        }
        return table;
    }
    public int brian(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}