import java.util.*;
public class PalindromicNumques9{
    public static boolean palin(int n){
        int temp=n;
        int newnum=0;
        if(n<0)
            return false;
        
        while(temp>0){
            int rem=temp%10;
            newnum=newnum*10+rem;
            temp=temp/10; 
        }
       return n==newnum ;   

        
    }
    public static void main(String args[]){
        int x = 121;
        System.out.println(palin(x));
    }
    
}