import java.util.*;
public class ques88{
    public static void merge(int nums1[],int m,int nums2[],int n){
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        
    }
    public static void main(String args[]){
    int nums1[]={1,2,3,0,0,0};
    int m=3;
    int nums2[]={2,5,6};
    int n=3;
    merge(nums1,m,nums2,n);
    }
}