import java.util.*;
public class ques169{
    public static int majorityElement(int nums[]){
        int n=nums.length;
        int n1=n/2;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=n1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}