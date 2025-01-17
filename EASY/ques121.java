import java.util.*;
public class ques121{
    public static int maxProfit(int prices[]){
        int n=prices.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]>buyprice){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}