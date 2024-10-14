import java.util.*;

public class ques4{
    public static double findMedianSortedArrays(int nums1[],int nums2[]){
        int m=nums1.length;
        int n=nums2.length;
        int merged[]=new int[m+n];
        for(int i=0;i<m;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merged[m+i]=nums2[i];
        }
        Arrays.sort(merged);
        int n1=merged.length;
        double median=0;
        if(n1%2==0){
            median=(merged[(n1/2)]+merged[(n1/2)-1])/2.0;
        }
        else{
            median=merged[(n1-1)/2];
        }
        return median;
    }
    public static void main(String args[]){
        int nums1[]={1,2};
        int nums2[]={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}