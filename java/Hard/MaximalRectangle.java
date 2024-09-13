package Hard;

import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args){
        char[][] matrix = {{'1', '0', '1', '1', '1'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] colSum = new int[rows][cols];
        int r = 0;
        for(int i = 0; i < cols; i++){
            int h = 0;
            for(int j = 0; j < rows; j++){
                if(matrix[j][i] == '1'){
                    h++;
                    colSum[j][i] = h;
                } else {
                    h = 0;
                    colSum[j][i] = 0;
                }
                
            }
        }
        for(int i = 0; i < rows; i++){
            r = lrgRctngl(colSum[i]) > r ? lrgRctngl(colSum[i]) : r;
        }
        return r;
    }

    public static int lrgRctngl(int[] heights){
        Stack<Integer> stc = new Stack<>();
        int mA = 0;
        int l = heights.length;

        for(int i = 0; i <= l; i++){
            int hgh = i == l ? 0 : heights[i];
            while(!stc.isEmpty() && hgh < heights[stc.peek()]){
                int y = heights[stc.pop()];
                int x = stc.isEmpty() ? i : i - stc.peek() - 1;
                mA = Math.max(mA, x * y);
            }
            stc.push(i);
        }
        return mA;
    }
}
