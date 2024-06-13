class Solution {
    public int maxProfit(int[] prices) {
        //Maintain Low price (Min Value)
        int lowBuyPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i= 0; i<prices.length; i++){
            if(prices[i]<lowBuyPrice){
                lowBuyPrice=prices[i];
            }
            int profit=prices[i]- lowBuyPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
        /*int sellOne=0;
        int holdOne=Integer.MIN_VALUE;
        for (final int price:prices){
            sellOne=Math.max(sellOne,holdOne+price);
            holdOne=Math.max(holdOne,-price);
        }
        return sellOne;*/
    }
}