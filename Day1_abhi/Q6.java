package Day1_abhi;

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        
        
        for(int x = 0; x < prices.length; x++){
            buy = Math.min(buy, prices[x]);
            profit = Math.max(profit, prices[x] - buy);
        }
        
        
        return profit;
    }
}