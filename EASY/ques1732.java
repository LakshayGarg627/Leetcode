import java.util.*;
public class ques1732{
    public static int largestAltitude(int gain[]){
        int n=gain.length;
        int newarr[]=new int[n+1];
        newarr[0]=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+gain[i];
            newarr[i+1]=sum;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<newarr.length;i++){
            if(newarr[i]>max){
                max=newarr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int gain[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}