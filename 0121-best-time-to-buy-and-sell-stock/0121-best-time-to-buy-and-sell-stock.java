class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        if(prices.length < 2) {
            return maxProfit; 
        }
        int b = 0; 
        int s = 1; 
        while ( s < prices.length) {
            if(prices[b] >= prices[s]) {
                b = s;
                s++;
            } else {
                int profit = prices[s] - prices[b];
                maxProfit = Math.max(profit, maxProfit);
                s++; 
            }
        }
        return maxProfit;   
    }
}