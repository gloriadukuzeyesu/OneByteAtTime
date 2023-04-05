package ArraysAndHashing;

public class BestTimeToBuyAndSellStockI {
    // This method returns the maximum profit that can be made by buying and selling
    // stocks given an array of stock prices.
    public int maxProfit(int[] prices) {
        // Initialize the minimum price encountered so far to be the maximum value
        // an integer can hold.
        int minPrice = Integer.MAX_VALUE;
        // Initialize the maximum profit to be the minimum value an integer can hold.
        int maxProfit = Integer.MIN_VALUE;
        // Iterate through the array of prices.
        for (int price : prices) {
            // Update the minimum price encountered so far to be the smallest of the
            // current price and the previous minimum price.
            minPrice = Math.min(price, minPrice);
            // Calculate the currentProfit that can be made by selling at the current price
            // minus the minimum price encountered so far.
            int currentProfit = price - minPrice;
            // Update the maximum currentProfit encountered so far to be the largest of the
            // current currentProfit and the previous maximum currentProfit.
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        // If no profit can be made, return 0.
        return Math.max(maxProfit, 0);
        // Otherwise, return the maximum profit.
    }
}
