import java.util.*;
public class ques1281{
    public static int subtractProductAndSum(int n){
        int copy=n;
        int sum=0;
        int product=1;
        while(copy>0){
            int rem=copy%10;
            sum=sum+rem;
            product=product*rem;
            copy=copy/10;
        }
        return product-sum;
        
    }
    public static void main(String args[]){
        System.out.println(subtractProductAndSum(4421));
    }
}