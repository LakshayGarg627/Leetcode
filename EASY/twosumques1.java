import java.util.*;
public class twosumques1{
    public static int[] twosum(int nums[],int target){
        int newarr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
}