import java.util.*;
public class ques1365{
    public static int[] smallerNumbersThanCurrent(int nums[]){
        int newarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            newarr[i]=count;
        }
        return newarr;
    }
    public static void main(String args[]){
        int nums[]={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
}