class Solution {
    public String reverseWords(String s) {
        //brute force
        String[] res = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            ans.append(res[i]);
            if (i > 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}