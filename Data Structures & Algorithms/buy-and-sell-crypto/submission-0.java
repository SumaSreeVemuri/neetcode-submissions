class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int p = 0, b = Integer.MAX_VALUE, s = prices[0];
        for (int i = 1; i < n; i++) {
            s = prices[i];
            b = Math.min(b, prices[i - 1]);
            p = Math.max(p, (s - b));
        }
        return p;
    }
}
