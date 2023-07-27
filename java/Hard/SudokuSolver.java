import java.util.Arrays;

public class SudokuSolver {

    static char[][] a = new char[9][9];
    static char[][] mtrx = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                                      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    public static void main(String[] args) {
         
        solveSudoku(mtrx);
        System.out.println(Arrays.deepToString(mtrx));
    }

    public static void solveSudoku(char[][] board){
        solve(board);
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                board[i][j]=a[i][j]; 
    }

    public static Boolean verify(int a, int b, int x, char[][] boardToVerify){
                for (int i = 0; i < 9; i++){
                    if (boardToVerify[a][i] == (char)x){
                        return false;            
                    }
                    if (boardToVerify[i][b] == (char)x){
                        return false;
                    }
                }
                int sqA = (b/3)*3;
                int sqB = (a/3)*3;
                for (int i = 0; i<3; i++){
                    for (int j = 0; j < 3; j++){
                        if (boardToVerify[sqB+i][sqA+j] == x){
                            return false;
                        }
                    }
                }
                return true;
            }

    public static void solve(char[][] boardToSolve){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (boardToSolve[i][j] == '.'){
                    for (int x = 49; x < 58; x++){
                        if (verify(i, j, x, boardToSolve)){
                            boardToSolve[i][j] = (char) x;
                            solve(boardToSolve);
                            boardToSolve[i][j] = '.';
                        }
                    }
                    return;
                }
            }
        }
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                a[i][j]=boardToSolve[i][j]; 
    }
}
