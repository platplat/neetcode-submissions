class Solution {
    public int maxProfit(int[] prices) {
        // Create variables to store minimum price and maximum possible profit
        int minPrice = prices[0];
        int maxProfit = 0;

        // Loop through the possible selling prices from index 1
        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if sold today
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            // Check if today's price is minimum so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        
        return maxProfit;
    }
}
