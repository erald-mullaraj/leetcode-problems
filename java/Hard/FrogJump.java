import java.util.HashSet;
import java.util.Set;

public class FrogJump {

    
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,7,9,10};
        System.out.println(canCross(a));
    }

    public static boolean canCross(int[] stones){
        Set<Boolean> s = new HashSet<>();
        int position = 0;
        int k = 1;
        canJump(k, position,stones, s); 
        return s.contains(true);
    }

    public static boolean verify(int step, int pos, int pos2, int[] stones){
        return stones[pos2]-stones[pos] == step;
    }

    public static void canJump(int k, int position, int[] stones, Set<Boolean> s){  
        for(int j = position + 1; j < stones.length;j++){
            if(verify(k-1, position, j, stones)){
                int stepbefore = position;
                position = j;
                if(position==stones.length-1) {
                    s.add(true);
                    return;
                }
                k--;
                canJump(k, position, stones, s);
                position = stepbefore;
                k++;
            }
            if(verify(k, position, j, stones)){
                int stepbefore = position;
                position = j;
                if(position==stones.length-1) {
                    s.add(true);
                    return;
                }
                canJump(k, position, stones, s);
                position = stepbefore;
            }
            if(verify(k+1, position, j, stones)){
                int stepbefore = position;
                position = j;
                if(position==stones.length-1) {
                    s.add(true);
                    return;
                }
                k++;
                canJump(k, position, stones, s);
                position = stepbefore;
                k--;
            }
        }
    }
}