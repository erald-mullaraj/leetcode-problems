package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(new Integer[]{1,2,2,1});
        List<Integer> n2 = Arrays.asList(new Integer[]{3,1,2});
        List<Integer> n3 = Arrays.asList(new Integer[]{1,3,2});
        List<Integer> n4 = Arrays.asList(new Integer[]{2,4});
        List<Integer> n5 = Arrays.asList(new Integer[]{3,1,2});
        List<Integer> n6 = Arrays.asList(new Integer[]{1,3,1,1});
        List<List<Integer>> l = List.of(n1, n2, n3, n4, n5, n6);
        System.out.println(l);
        System.out.println((leastBricks(l)));
    }
    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> m = new HashMap<>();
        int notCrossed = 0;

        for(List<Integer> row : wall) {
            int x = 0;
            for(int i = 0; i < row.size() - 1; i++) {
                // geting the postions of possible vertical lines
                x += row.get(i);
                // counting the times the line will cross 
                m.put(x, m.getOrDefault(x, 0)+1);
                if (notCrossed < m.get(x)){
                    notCrossed = m.get(x);
                }
            }
        }
        return wall.size() - notCrossed;
    }
}
