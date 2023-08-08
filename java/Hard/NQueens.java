import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
         solveNQueens(4 );
    }

    private static List<List<String>> solveNQueens(int n) {      

        String newString = ".".repeat(n);
        List<String> l1 = new ArrayList<>();
        for (int i= 0; i < n; i++){
            StringBuffer str = new StringBuffer(newString);
            str.setCharAt(i, 'Q');
            String qStr = str.toString();
            l1.add(qStr);
        }

        for (int i = 0; i < n; i++){
             List<String> l2 = new ArrayList<>();
             l2.add(l1.get(i));
             for(int j = 0; j < n; j++){
                
             }
             System.out.println(l2);
        }
        
        List<List<String>> l3 = new ArrayList<List<String>>();
        l3.add(l1);
        
        return null;
    }
}