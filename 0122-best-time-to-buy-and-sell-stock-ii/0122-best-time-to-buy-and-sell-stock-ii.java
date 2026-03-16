class Solution {
    public int maxProfit(int[] prices) {
        //peak valley approach
        int n = prices.length, peak = prices[0], valley = prices[0], i = 0, profit = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }
}