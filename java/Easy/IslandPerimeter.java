package Easy;

public class IslandPerimeter {

    public static void main(String[] args){

        int[][] a = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(a));
    }
    
    public static int islandPerimeter(int[][] grid){

        int p = 0;
        int il = grid.length;
        int jl = grid[0].length;

        for(int i = 0; i < il; i++){
            for(int j = 0; j < jl; j++){
                if(grid[i][j] == 1){
                    p += 4;
                    if(i + 1 < il && grid[i + 1][j] == 1){
                        p -= 2;
                    }
                    if(j + 1 < jl && grid[i][j + 1] == 1){
                        p -= 2;
                    }
                }
            }
        }

        return p;
    }
}
