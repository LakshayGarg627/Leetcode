import java.util.*;
public class ques977{
    public static int[] sortedSquares(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }
    public static void main(String args[]){
        int nums[]={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}