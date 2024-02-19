class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 1) {
            return 0;
        }
        int maxProfit = 0; 
        int minSoFar = Integer.MAX_VALUE; 
        
        for(int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i], minSoFar); 
            maxProfit = Math.max(maxProfit, (prices[i] - minSoFar));
        }
        return maxProfit; 
    }
}