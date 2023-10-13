class Solution {
    public int maxProfit(int[] prices) {  //30000,400000,40000,39000,6868903848
        if(prices.length < 1){
            return 0;
        }
        // for each iteration * min and maxProfit 
        int maxPro = 0; 
        int minSoFar = 10000; 
        for(int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i], minSoFar); // 3
            maxPro = Math.max(maxPro, (prices[i] - minSoFar));  // 0 ,  3 -1000
        }
        return maxPro;
    }
}