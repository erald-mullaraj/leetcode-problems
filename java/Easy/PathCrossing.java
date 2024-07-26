package Easy;

import java.util.ArrayList;

public class PathCrossing {
    public static void main(String[] args){
        String path = "NES";
        String path2 = "NNNNEEEEENNNEEENNEEESSSSSSSEWN";
        long sTime = System.nanoTime();
        System.out.println(isPathCrossing(path));
        long eTime = System.nanoTime();
        System.out.println("time in miliseconds: " + (eTime - sTime) + " ns");
        System.out.println(isPathCrossing(path2));

    }

    public static boolean isPathCrossing(String path) {
        
        ArrayList<int[]> vis = new ArrayList<>();
        int[] st = new int[2];
        st[0] = 0;
        st[1] = 0;
        vis.add(st);
        int a = 0, b = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N') a++;
            else if(path.charAt(i) == 'S') a--;
            else if(path.charAt(i) == 'E') b++;
            else b--;
        
            for(int j = 0; j < vis.size(); j++){
                int[] p = vis.get(j);
                if(p[0] == a && p[1] == b){
                    return true;
                }
            }
            int[] np = new int[2];
            np[0]= a;
            np[1] = b;
            vis.add(np);
        }
        return false;
    }
}
