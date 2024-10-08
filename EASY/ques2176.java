import java.util.*;
public class ques2176{
    public static int countPairs(int nums[],int k){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]==nums[j])&&(i*j)%k==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
int nums[]={3,1,2,2,2,1,3};
int k=2;
System.out.println(countPairs(nums,k));
    }
}