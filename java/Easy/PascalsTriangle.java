package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] arga){
        int n = 29;
        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll =  new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        ll.add(a);
        if(numRows==1){
            return ll;
        }      
        for (int i = 1; i < numRows; i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for (int j = 0; j< i-1;j++){
                l.add(ll.get(i-1).get(j) + ll.get(i-1).get(j+1));
            }
            l.add(1);
            ll.add(l);
        }
        return ll;
    }
}
