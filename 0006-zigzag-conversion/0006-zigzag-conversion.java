class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows > n) return s;
        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }
        int i = 0;
        while (i < n) {
            for (int index = 0; index < numRows && i < n; index++) {
                ans[index].append(s.charAt(i));
                i++;
            }
            for (int index = numRows - 2; index > 0 && i < n; index--) {
                ans[index].append(s.charAt(i));
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder x : ans) {
            sb.append(x);
        }
        return sb.toString();
    }
}