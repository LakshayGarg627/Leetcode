import java.util.*;
public class ques1480{

    public static int[] runningsum(int nums[]){
        int n=nums.length;
        int sum[]=new int[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
        public static void main(String args[]){
            int nums[]={1,2,3,4};
            System.out.println(Arrays.toString(runningsum(nums)));
    }
}