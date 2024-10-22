import java.util.*;
public class ques74{
    public static boolean searchMatrix(int matrix[][],int target){
        int n=matrix.length;
        int row=0;
        int col=matrix[0].length-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(searchMatrix(matrix,10));
    }
}