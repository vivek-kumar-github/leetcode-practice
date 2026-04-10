class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //using character frequency count optimal
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] chars = new int[26];
            for (char c : str.toCharArray()) {
                chars[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int count : chars) {
                sb.append('#').append(count);
            }
            String key = new String(sb);
            System.out.println(key);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}