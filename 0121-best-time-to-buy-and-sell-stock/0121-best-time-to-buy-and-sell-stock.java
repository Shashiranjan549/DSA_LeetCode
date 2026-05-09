/*
class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];

            } else if (prices[i]-buy>profit){
                profit=prices[i]-buy;
            }

        }
        return profit;
        
    }
}
*/
// Other Method


class Solution {
    public int maxProfit(int[] prices) {
		int MaximumProfit=0;
		int MinimumStockPrice=prices[0];
		for(int CurrencyDayPrice : prices) {
			MaximumProfit=Math.max(MaximumProfit,CurrencyDayPrice- MinimumStockPrice);
			MinimumStockPrice=Math.min(MinimumStockPrice,CurrencyDayPrice);
		}
		return MaximumProfit;
	}
	
	/*
	 *  Input . Prices =[7,1,5,3,6,4]
	 *  MaximumProfit=0
	 *  MinimumStockPrice=Prices[0] = 7 (
	 */

}
