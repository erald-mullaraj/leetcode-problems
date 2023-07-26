import java.util.Arrays;

public class SudokuSolver {

    interface verification {
        Boolean verify(int a, int b, int x);
    }
    interface findsolution {
        void findSudoku();
    }
    

    public static void main(String[] args) {
        char[][] mtrx = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                                      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};    
        solveSudoku(mtrx);
    }

    public static void solveSudoku(char[][] board){
        verification v = new verification(){
            public Boolean verify(int a, int b, int x){
                for (int i = 0; i < 9; i++){
                    if (board[a][i] == (char)x){
                        return false;            
                    }
                    if (board[i][b] == (char)x){
                        return false;
                    }
                }
                int sqA = (b/3)*3;
                int sqB = (a/3)*3;
                for (int i = 0; i<3; i++){
                    for (int j = 0; j < 3; j++){
                        if (board[sqB+i][sqA+j] == x){
                            return false;
                        }
                    }
                }
                return true;
            }
        };  

        findsolution f = new findsolution(){
            public void findSudoku(){
                for (int i = 0; i < 9; i++){
                    for (int j = 0; j < 9; j++){
                        if (board[i][j] == '.'){
                            for (int x = 49; x < 58; x++){
                                if (v.verify(i, j, x)){
                                    board[i][j] = (char) x;
                                    findSudoku();
                                    board[i][j] = '.';
                                }
                            }
                            return;
                        }
                    }
                }
                System.out.println(Arrays.deepToString(board));   
            }
        };
        f.findSudoku();
    }
}
