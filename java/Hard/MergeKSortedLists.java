import java.util.ArrayList;
import java.util.Collections;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
         this.val = val; 
        }
      ListNode(int val, ListNode next) {
         this.val = val; this.next = next; 
        }
  }

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> nums = new ArrayList<>();
        ListNode start = new ListNode(0);
        ListNode mrgLs = start;

        for (int j = 0; j < lists.length; j++){
            while(lists[j] != null){
                nums.add(lists[j].val);
                lists[j] = lists[j].next;
            }
        }
        Collections.sort(nums);
        

        for (int j = 0; j < nums.size(); j++){
            ListNode newNode = new ListNode(nums.get(j));
            mrgLs.next = newNode;
            mrgLs = mrgLs.next;
        }
        return start.next;   
    }
}
