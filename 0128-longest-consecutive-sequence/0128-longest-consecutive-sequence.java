class Solution {
    public int longestConsecutive(int[] nums) {
        //optima using hashset
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num, streak = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    streak++;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }
}