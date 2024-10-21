import java.util.*;
public class ques136{
    public static int singleNumber(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                for(int j=1;j<=n;j++){

                
                if(nums[j]==nums[j-1]){
                    return nums[j+1];
                }
                else{
                    return nums[j];
                }
                }
            }
        }
        return -1;
        
        }
    
    public static void main(String args[]){
        int nums[]={2,2,1};
        System.out.println(singleNumber(nums));
    }
}