class Solution {
    public int maxProfit(int[] prices) {
		int MaximumProfit=0;

		for (int i = 1; i < prices.length; i++) {
            
            if (prices[i] > prices[i - 1]) {
                MaximumProfit += prices[i] - prices[i - 1];
            }
        }
		return MaximumProfit;
	}
}