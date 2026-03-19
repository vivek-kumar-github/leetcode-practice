class Solution {
    public int firstMissingPositive(int[] nums) {
        //using extra space
        int n = nums.length;
        HashSet<Integer> list = new HashSet<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}