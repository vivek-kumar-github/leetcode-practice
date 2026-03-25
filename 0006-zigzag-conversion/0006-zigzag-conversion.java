class Solution {
    public String convert(String s, int numRows) {
        //using extra space
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        int dir = 1;
        for (char x : s.toCharArray()) {
            sb[i].append(x);
            if (i == 0) {
                dir = 1;
            } else if (i == numRows - 1) {
                dir = -1;
            }
            i += dir;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : sb) {
            ans.append(row);
        }
        return ans.toString();
    }
}