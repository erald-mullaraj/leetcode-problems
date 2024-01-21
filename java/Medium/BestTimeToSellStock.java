package Medium;

public class BestTimeToSellStock {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit (int[] prices){
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] > prices[i]){
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
