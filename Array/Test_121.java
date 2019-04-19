package Leetcode.Array;

public class Test_121 {
    public int maxProfit(int[] prices) {
        int lowest=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
            }
            if(prices[i]-lowest>profit){
                profit=prices[i]-lowest;
            }
        }
        return profit;
    }
}
