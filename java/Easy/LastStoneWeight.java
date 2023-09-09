import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args){
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mH = new PriorityQueue();
        for (int st : stones){
            mH.add(-st);
        } 
        while (mH.size() > 1) {
            int st1 = mH.remove();
            int st2 = mH.remove();
            if (st1 != st2) mH.add(st1 - st2);
        }
        int res;
        if(mH.size() != 0){
            res = -mH.remove();
        } else {
           res = 0; 
        }
        return res;
    }
}
