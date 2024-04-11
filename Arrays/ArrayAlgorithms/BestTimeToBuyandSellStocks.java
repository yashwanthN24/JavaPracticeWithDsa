package Arrays.ArrayAlgorithms;

public class BestTimeToBuyandSellStocks {
    public static int buyandsellstocks(int prices[]) {
        // buyprice tracks the lowest buy price
        int buyprice = Integer.MAX_VALUE;

        int maxprofit = 0;

        // iterate through the prices of stocks array to find the lowest buyprice and
        // max selling price to get maxprofit
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) { // profit
                int profit = prices[i] - buyprice; // todays profit of the day
                maxprofit = Math.max(maxprofit, profit); // stores the final max profit

            } else { // means todays stock price is less than the previous days so buy it today
                buyprice = prices[i]; // buy the stock with lowest buyprice
                // prices[i] is todays price of the stock
            }
        }

        return maxprofit;

        // time complexity :
        // the whole function depends on the length of prices array so if we assume n =
        // prices.length
        // time complexity of this code is O(n)
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellstocks(prices));
    }
}
