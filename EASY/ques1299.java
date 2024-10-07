import java.util.*;
public class ques1299{
    public static int[] replaceElememts(int arr[]){
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            arr[i]=max;
            if(current>max){
                max=current;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElememts(arr)));
    }
}