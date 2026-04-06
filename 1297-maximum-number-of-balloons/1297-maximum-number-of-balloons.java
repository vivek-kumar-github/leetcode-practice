class Solution {
    public int maxNumberOfBalloons(String text) {
        //using hashmap with target word frequency
        String target = "balloon";
        HashMap<Character, Integer> textCount = new HashMap<>();
        for (char c : text.toCharArray()) {
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