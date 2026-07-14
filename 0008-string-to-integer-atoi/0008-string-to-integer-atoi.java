class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int i = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            if (sign * res <= minInt) {
                return minInt;
            } else if (sign * res >= maxInt) {
                return maxInt;
            }
            i++;
        }
        return (int) res * sign;
    }
}