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
        ListNode start = new ListNode(0);
        ListNode mrgLs = start;
        int minIndx = 0;

        for (int j = 0; j < lists.length; j++){
            while(lists[j] != null){
                for (int i = 0; i < lists.length; i++){    
                    if (lists[i] != null && (lists[i].val <= lists[minIndx].val)){
                        minIndx = i;      
                    }
                }
                ListNode newNode = new ListNode(lists[minIndx].val);
                mrgLs.next = newNode;
                mrgLs = mrgLs.next;
                lists[minIndx] = lists[minIndx].next;
                minIndx = 0; 
            }
        }
        return start.next;   
    }
}
