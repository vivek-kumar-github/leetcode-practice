class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

       

        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] <= current) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i % n] = -1;
            } else {
                ans[i % n] = nums[stack.peek()];
            }

            stack.push(i % n);
        }

        return ans;
    }
}