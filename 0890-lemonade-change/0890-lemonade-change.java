class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for (int x : bills) {
            if (x == 5) {
                count5++;
            } else if (x == 10) {
                count10++;
                if (count5 >= 1) {
                    count5--;
                } else {
                    return false;
                }
            } else if (x == 20) {
                if (count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                } else if (count5 >= 3) {
                    count5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}