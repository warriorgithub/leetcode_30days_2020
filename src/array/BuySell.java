package array;

public class BuySell {
    public int maxProfit(int[] prices){
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]< prices[i]){

                profit+=prices[i]-prices[i-1];
            }
        }return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(new BuySell().maxProfit(arr));
    }
}
