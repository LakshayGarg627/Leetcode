import java.util.*;

public class ques1295{
    public static int findNumbers(int nums[]){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            while(nums[i]>0){
                int rem=nums[i]%10;
                cnt++;
                nums[i]=nums[i]/10;
            }
            
            if(cnt%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}