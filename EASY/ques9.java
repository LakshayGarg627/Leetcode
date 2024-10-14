import java.util.*;
public class ques9{
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
     int copy=x;
     int rev=0;
     while(copy>0){
        int rem=copy%10;
        rev=rev*10+rem;
        copy=copy/10;
     }   
     return x==rev;
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(10));
    }
}