class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //using cyclic sort
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }
        return list;
    }
}