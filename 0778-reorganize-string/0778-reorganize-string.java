class Solution {
    public String reorganizeString(String s) {
        //using max heap greedy
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int n = s.length();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if (freq[i] > (n + 1) / 2) {
                    return "";
                }
                heap.offer(new int[]{freq[i], i});
            }
        }

        StringBuilder result = new StringBuilder();
        int[] prev = null;
        while (!heap.isEmpty()) {
            int[] curr = heap.poll();
            if (prev != null && prev[0] > 0) {
                heap.offer(prev);
            }
            result.append((char) (curr[1] + 'a'));
            curr[0]--;
            prev = curr;
        }
        
        return result.length() == n ? result.toString() : "";
    }
}