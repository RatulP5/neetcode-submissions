class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0], maxProfit=0;
        for(int s: prices){
            minPrice=Math.min(s, minPrice);
            maxProfit=Math.max(maxProfit, s-minPrice);
        }
        return maxProfit;
    }
}
