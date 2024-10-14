import java.util.*;
public class ques2535{
    public static int differenceOfSum(int nums[]){
        int n=nums.length;
        int elesum=0;
        int digsum=0;
        for(int i=0;i<n;i++){
            elesum=elesum+nums[i];
            while(nums[i]>0){
                int rem=nums[i]%10;
                digsum=digsum+rem;
                nums[i]=nums[i]/10;
            }
        }
        return elesum-digsum;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
}