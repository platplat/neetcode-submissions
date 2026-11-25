class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int currentMax = 0;

        while (buyIndex < prices.length) {
            int buy = prices[buyIndex];
            for (int i = buyIndex+1; i < prices.length; i++) {
                if (prices[i] - buy > currentMax) {
                    currentMax = prices[i] - buy;
                }
            }
            buyIndex++;
        }

        return currentMax;
    }
}
