class Solution {
    public int maxProfit(int[] prices) {  
        if(prices.length < 1){
            return 0;
        }
        // for each iteration * min and maxProfit 
        int maxPro = 0; 
        int minSoFar = Integer.MAX_VALUE; // 
        for(int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i], minSoFar); 
            maxPro = Math.max(maxPro, (prices[i] - minSoFar));  // 0 ,  3 -1000
        }
        return maxPro;
    }
}