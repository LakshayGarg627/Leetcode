import java.util.*;
public class ques2460{
    public static int[] applyOperations(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            else{
                nums[i]=nums[i];
            }
        }
        
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;    
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[]={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}