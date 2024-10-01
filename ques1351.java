import java.util.*;
public class ques1351{
    public static int countNegative(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int grid[][]={
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        System.out.println(countNegative(grid));
    }
}