package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args){
        System.out.println(getRow(9));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        int a = 1;
        for(int i = 0; i < rowIndex/2; i++){
            a = a * (rowIndex - i)/(i + 1);
            r.add(a);
        }
        for(int i = (rowIndex - 1)/2; i >= 0; i--){
            r.add(r.get(i));
        }
        return r;
    }
    
}
