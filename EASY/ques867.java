import java.util.*;
public class ques867{
    public static int[][] transpose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int matrix2[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j]=matrix[j][i];
            }
        }
        return matrix2;
    }
    public static void main(String args[]){
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        System.out.println(Arrays.toString(transpose(matrix)));
    }
}