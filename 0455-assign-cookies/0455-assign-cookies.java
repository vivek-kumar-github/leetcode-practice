class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0, r = 0, m = s.length, n = g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        while (l < m && r < n) {
            if (g[r] <= s[l]) {
                r++;
            }
            l++;
        }
        return r;
    }
}