package Medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    static char[][] a = new char[9][9];
    static char[][] mtrx = new char[][]{{'.', '.', '.', '.', '5', '.', '.', '.', '.'},
                                      {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                                      {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                                      {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                                      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                                      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                                      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                                      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                                      {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};
    public static void main(String[] args) {
         
        System.out.println(isValidSudoku(mtrx));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> row = null;
        Set<Character> col = null;
        Set<Character> block = null;
        
        for (int i = 0; i < 9; i++) {
            row = new HashSet<>();
            col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
        
                if (board[i][j] != '.'){
                    if (row.contains(board[i][j])){
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.'){
                    if (col.contains(board[j][i])){
                        return false;
                    } else {
                        col.add(board[j][i]);
                    }
                }
                block = new HashSet<>();
                int rows = (j/3)*3;
                int cols = (i/3)*3;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (board[rows + x][cols + y] != '.'){
                            if (block.contains(board[rows + x][cols + y])){
                                return false;
                            } else {
                                block.add(board[rows + x][cols + y]);
                            }
                        }
                    }
                }
            }
        }
        return true;     
    }

    public static boolean isValidSudoku2(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.'){
                    continue;
                }
                for(int x = 0; x < 9; x++){
                    if(x != i && board[x][j] == board[i][j]){
                        return false;
                    }
                }
                for(int y = 0; y < 9; y++){
                    if(y != j && board[i][y] == board[i][j]){
                        return false;
                    }
                }
                int a = (i/3)*3;
                int b = (j/3)*3;
                for (int x = a; x < a + 3; x++) {
                    for (int y = b; y < b + 3; y++) {
                        if ((x != i || y != j) && (board[x][y] == board[i][j])){
                            return false;
                            }
                        }
                    }
                }
            }
        return true;     
    }
}

