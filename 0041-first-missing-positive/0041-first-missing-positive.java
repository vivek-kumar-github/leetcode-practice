class Solution {
    public int firstMissingPositive(int[] nums) {
        //using extra space
        int n = nums.length;
        HashSet<Integer> list = new HashSet<>();
        int min = 1;
        int max = 1;
        for (int num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            list.add(num);
        }
        if (min <= 0) min = 1;
        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return max + 1;
    }
}