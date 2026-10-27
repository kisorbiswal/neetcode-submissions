class Solution {
    public int maxProfit(int[] prices) {
		int result = 0;

		int high = prices[0];
		int low = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < low) {
				result = Math.max(high - low, result);
				low = prices[i];
				high = prices[i];
			} else if (prices[i] > high) {
				high = prices[i];
			}
		}

		return Math.max(high - low, result);
	}
}
