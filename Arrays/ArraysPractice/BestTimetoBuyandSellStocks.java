package Arrays.ArraysPractice;

/*
 * You  are  given  an  array prices where prices[i] is the price of a given stock on the ith day.
 * Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0
 */

public class BestTimetoBuyandSellStocks {
    public static int besttimetobuyandsell(int prices[]) {

        // buyprice to track lowest buying price 
        int buyprice = Integer.MAX_VALUE;

        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            // my buyprice is not too much and i got a higher selling price to get profit
            if (buyprice < prices[i]) {
                // profit 
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                // no profit 
                // so buy the stock at a lowest buyprice based the current cost of the stock i.e prices[i] (todays stock price) 
                // to get profit 
                buyprice = prices[i];
            }

        }
        return maxprofit;
    }
    
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(besttimetobuyandsell(prices));
    }
}
