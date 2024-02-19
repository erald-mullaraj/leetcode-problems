package Random;

import java.util.HashSet;
import java.util.Set;

public class SaFrutaNgelen {
    
    public static void main(String[] args){
        int [] a = {2, 2, 2, 2, 3, 1 , 5, 4};
        System.out.println(saNgelen(a));
    }

    public static int saNgelen(int[] frutat){
        Set<Integer> a = new HashSet<>();
        int r = 0;
        for(int i = 0; i < frutat.length; i++){
            if (a.contains(frutat[i])){
                r++;
            } else if(!a.contains(frutat[i]) && r == 0){
                a.add(frutat[i]);
                r++;
            } else if(!a.contains(frutat[i]) && r == 1){
                r--;
                a.clear();
            } else {
                r--;
                a.remove(frutat[i]);
            }
        }
        return r;
    }
}
