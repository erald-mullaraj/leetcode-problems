package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsOfInterchangeableRectangles {

    public static void main(String[] args) {
        
        int[][] rectangles = {{4,8}, {3,6}, {10, 20}, {15, 30}, {1, 3}, {2, 6}};
        System.out.println(interchangeableRectangles2(rectangles));

    }

    public static long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> ratios = new HashMap<>();
        for(int[] r : rectangles){
            double ratio = (double) r[0]/r[1];
            ratios.put(ratio, ratios.getOrDefault(ratio,  (long) 0) + 1);
        }

        long pNum = 0;
        for( long v : ratios.values()){
            // n!/(n-k)!*k!   -> k = 2   -> n * (n - 1) / 2
            pNum += v * (v - 1) / 2;
        }
        return pNum;
    }

     public static long interchangeableRectangles2(int[][] rectangles) {
        int rl = rectangles.length;
        double rt[] = new double[rl];
        for(int i = 0; i < rl; i++) {
            rt[i] = (double) rectangles[i][0] / rectangles[i][1];
        }
        Arrays.sort(rt);
        long pNum = 0;
        int i = 0;
        while(i < rl - 1){
            long c = 1;
            while(i < rl - 1 && rt[i] == rt[i + 1]) {
                i++;
                c++;
            }
            pNum += (c * (c - 1))/2;
            i++;
        }
        return pNum;
    }
    
}
