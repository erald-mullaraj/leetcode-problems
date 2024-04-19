package Medium;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class SwapingNodesInLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode f = head;
        ListNode s = head;

        for (int i = 1; i < k; i++){
            f = f.next;
        }
        int t = f.val;
        ListNode tn = f;
        while(f.next != null){
            f = f.next;
            s = s.next;
        }
        tn.val = s.val;
        s.val = t;
        return head;
    }
}
