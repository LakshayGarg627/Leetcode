import java.util.*;
public class ques1572{
    public static int diagonalSum(int mat[][]){
        
        int n=mat.length;
        int psum=0;
        int dsum=0;

        for(int i=0;i<n;i++){
            psum=psum+mat[i][i];
            dsum=dsum+mat[i][n-i-1];            
        }
        if(n%2!=0){
            return psum+dsum-mat[n/2][n/2];
        }
        return psum+dsum;
    }
    public static void main(String args[]){
        int matrix[][]={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        System.out.println(diagonalSum(matrix));
    }
}