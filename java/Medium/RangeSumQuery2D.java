package Medium;

class NumMatrix {

    int[][] sum;

    public NumMatrix(int[][] matrix) {
        if(matrix == null) return;
        int x = matrix[0].length;
        int y = matrix.length;
        if(x == 0 || y == 0) return;
        sum = new int[y][x];

        for(int i = 0; i < y; i++){
            int s = 0;
            for(int j = 0; j < x; j++){
                if(i == 0){
                    s += matrix[i][j];
                    sum[i][j] = s;
                } else {
                    s += matrix[i][j];
                    sum[i][j] = s + sum[i - 1][j];
                }  
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        if(this.sum == null) return 0;
        if(row1 == 0 && col1 == 0) return sum[row2][col2];
        else if(row1 == 0) return sum[row2][col2] - sum[row2][col1 - 1];
        else if(col1 == 0) return sum[row2][col2] - sum[row1 - 1][col2];
        else return sum[row2][col2] + sum[row1 - 1][col1 - 1]  - sum[row2][col1-1] - sum[row1 - 1][col2];
    }
}

public class RangeSumQuery2D {
    public static void main(String[] args) {

        int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        int[][] matrix2 = {{7,7,0}, {-4,-7,7}, {-4,0,-2}, {-8,-5,6}};
        NumMatrix obj = new NumMatrix(matrix2);
        int p1 = obj.sumRegion(0, 2, 2, 2);
        System.out.println(p1);
    }
}
