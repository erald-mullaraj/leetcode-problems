package Easy;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
             this.val = val; this.next = next; }
    }

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val){
        ListNode res = new ListNode(0, head);
        ListNode prev = res;
        ListNode curr = head;
        while(curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            } else {
                prev = curr;
            }   
            curr = curr.next;
        }
        return res.next;
    }

    public ListNode removeElements2(ListNode head, int val){
        if(head==null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}