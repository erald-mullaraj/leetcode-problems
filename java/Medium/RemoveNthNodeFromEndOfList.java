package Medium;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t = new ListNode(1, head);
        ListNode s = t;
        ListNode f = head;
        for(int i = 0; i < n; i ++){
            f = f.next;
        }
        while(f != null){
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return t.next;
    }
    
}
