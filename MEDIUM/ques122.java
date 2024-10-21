import java.util.*;
public class ques122{
    public static int maxProfit(int prices[]){
        int n=prices.length;
        int sum=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                sum=sum+profit;
                buyprice=prices[i];
            }
            else{
                buyprice=prices[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
int prices[] = {7,1,5,3,6,4};
System.out.println(maxProfit(prices));
    }
}