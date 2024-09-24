import java.util.*;
public class Trappingrainwaterques42{
    public static int trap(int height[]){
        int n=height.length;

        // leftmost array
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }

        //rightmost array
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }
    public static void main(String args[]){
        int height[]={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}