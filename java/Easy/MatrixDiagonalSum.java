package Easy;

import java.util.Arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args){
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(diagonalSum(a));
    }

    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int r = 0;
        for(int i = 0; i < n; i++){
            r += mat[i][i] + mat[i][n-i-1];
        }
        if(n%2 == 1){
            r -= mat[n/2][n/2];
        }
        return r;
    }
    
}
