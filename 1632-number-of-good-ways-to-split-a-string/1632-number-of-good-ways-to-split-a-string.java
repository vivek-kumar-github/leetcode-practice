class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] prefixDistinct = new int[n];
        int[] suffixDistinct = new int[n];

        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            seen.add(s.charAt(i));
            prefixDistinct[i] = seen.size();
        }

        seen.clear();
        for (int i = n - 1; i >= 0; i--) {
            seen.add(s.charAt(i));
            suffixDistinct[i] = seen.size();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (suffixDistinct[i] == prefixDistinct[i - 1]) {
                count++;
            }
        }
        return count;
    }
}