import java.util.*;
public class ques34{
    public static int[] searchRange(int nums[],int target){
        int ans[]=new int[2];
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                else{
                    last=i;
                }
            }
        }  
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    public static void main(String args[]){
        int nums[]={5,7,7,8,8,10};
        int target=6;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}