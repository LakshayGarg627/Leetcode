import java.util.*;
public class ques1588{
    public static int sumOddLengthSubarrays(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
            }
        }
        return sum;

    }
    public static void main(String args[]){
int arr[]={1,4,2,5,3};
System.out.println(sumOddLengthSubarrays(arr));
    }
}