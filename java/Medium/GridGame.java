package Medium;

import java.util.Arrays;

public class GridGame {
    public static void main(String[] args){
        int[][] grid = {{2, 5}, {1, 1}};
        int[][] grid2 = {{3,3,1}, {8,5,2}};
        int[][] grid3 = {{20,3 ,20,17, 2,12,15,17, 4,15}, 
                         {20,10,13,14,15, 5, 2, 3,14, 3}};
        System.out.println(gridGame(grid));
        System.out.println(gridGame(grid2));
        System.out.println(gridGame(grid3));
    }

    public static long gridGame(int[][] grid) {
        int l = grid[0].length;
        if(l == 1) return 0;
        long[][] gr = new long[2][l];
        gr[0][l - 1] = grid[0][l - 1];
        for(int i = l - 2 ; i > 0; i--){
            gr[0][i] = grid[0][i] + gr[0][i + 1];
        }
        gr[1][0] = grid[1][0];
        for(int i = 1; i < l; i++){
            gr[1][i] = grid[1][i] + gr[1][i - 1];
        }
        
        long m = Math.min(gr[0][1], gr[1][l-2]);
        for(int i = 1; i < l - 1; i++){
            m = Math.min(Math.max(gr[0][i + 1], gr[1][i - 1]), m);
        }
        return m;
    }
}
