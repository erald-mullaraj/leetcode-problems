package Easy;

import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int a;
    public KthLargest(int k, int[] nums) {
        this.a = k;
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        if(pq.size() < a){
            pq.add(val);
        } else if(val > pq.peek()) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }   
}
