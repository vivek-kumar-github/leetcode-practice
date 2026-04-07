class Solution {
    public int rearrangeCharacters(String s, String target) {
        //using hashmap with target and string word frequency
        HashMap<Character, Integer> textCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            textCount.put(c, textCount.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> targetCount = new HashMap<>();
        for (char c : target.toCharArray()) {
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : targetCount.entrySet()) {
            int supply = textCount.getOrDefault(entry.getKey(), 0);
            int demand = entry.getValue();
            result = Math.min(result, supply / demand);
        }
        return result;
    }
}