class Solution {
    public boolean isIsomorphic(String s, String t) {
        //using last seen index
        int[] lastSeenS = new int[256];
        int[] lastSeenT = new int[256];
        Arrays.fill(lastSeenS, -1);
        Arrays.fill(lastSeenT, -1);
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (lastSeenS[charS] != lastSeenT[charT]) {
                return false;
            }
            lastSeenS[charS] = i;
            lastSeenT[charT] = i;
        }
        return true;
    }
}