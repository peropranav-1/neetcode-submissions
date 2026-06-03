class Solution {
    public int maxProfit(int[] prices) {
        int currentBuy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(currentBuy < prices[i]) {
                profit = profit + prices[i] - currentBuy;
            }
            currentBuy = prices[i];
        }
        return profit;
    }
}