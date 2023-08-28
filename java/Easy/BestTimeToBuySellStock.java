public class BestTimeToBuySellStock {

    public static void main(String[] args){
        int[] a = {7,6,4,3,1,7,6,4,3,11,2};
        System.out.println(maxProfit(a));
        maxProfit(a);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 0; i < prices.length; i++){
            if (prices[i]<min){
                min = prices[i];
                max = prices[i];
            } else if (prices[i]>max){
                max = prices[i];
            }
            if((max-min) > maxProfit){
                maxProfit = max - min;
            }
        }
        return maxProfit;
    }
}