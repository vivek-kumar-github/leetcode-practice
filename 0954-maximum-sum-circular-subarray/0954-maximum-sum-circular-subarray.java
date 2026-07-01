class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sm1 = Integer.MIN_VALUE;
        int rnsm = 0;
        for (int i = 0; i < nums.length; i++) {
            rnsm += nums[i];
            sm1 = Math.max(sm1, rnsm);
            if (rnsm < 0) rnsm = 0;
        }
        int sm2 = Integer.MAX_VALUE;
        int rm2 = 0;
        for (int i = 0; i < nums.length; i++) {
            rm2 += nums[i];
            sm2 = Math.min(rm2, sm2);
            if (rm2 > 0) rm2 = 0;
        }
        int ts = 0;
        for (int i = 0; i < nums.length; i++) {
            ts += nums[i];
        }
        return Math.max(sm1, (ts - sm2) == 0 ? sm1 : (ts - sm2));
    }
}