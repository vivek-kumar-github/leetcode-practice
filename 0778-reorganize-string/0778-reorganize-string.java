class Solution {
    public String reorganizeString(String s) {
        //Frequency Count + Index Filling (Optimal)
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = 0, maxChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = i;
            }
        }

        int n = s.length();
        if (maxFreq > (n + 1) / 2) return "";

        char[] result = new char[n];
        int idx = 0;

        while (freq[maxChar] > 0) {
            result[idx] = (char) (maxChar + 'a');
            freq[maxChar]--;
            idx += 2;
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (idx >= n) idx = 1; // Wrap to odd indices
                result[idx] = (char) (i + 'a');
                freq[i]--;
                idx += 2;
            }
        }
        return new String(result);
    }
}