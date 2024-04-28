package Easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2dGrid {

    public static void main(String[] args){
        int[][] gr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(shiftGrid(gr, 2));
    }
    
    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        List<List<Integer>> l = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int s = m*n;

        int[][] g = new int[m][n];
        int nidx = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nidx = (i*n + j + k) % s;
                g[nidx/n][nidx%n] = grid[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            List<Integer> l1 = new ArrayList<>();
            for(int j = 0; j < n; j++){
                l1.add(g[i][j]);
            }
            l.add(l1);
        }
        return l;
    }
}
