class Solution {
    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 0;
        int profit = 0;
        int len = prices.length;

        while(sell < len)
        {
            if(prices[sell] < prices[buy])
            {
                buy = sell;
            }
            else
            {
                int check = prices[sell] - prices[buy];
                if(profit < check)
                {
                    profit = check;
                }
            }
            sell++;
        }

        return profit;
    }
}
