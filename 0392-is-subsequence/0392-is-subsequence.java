class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = s.length(), v = t.length();
        int i = 0, j = 0;
        while (i < x && j < v) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; j++;
            } else {
                j++;
            }
        }
        if (i == x) {
            return true;
        }
        return false;
    }
}