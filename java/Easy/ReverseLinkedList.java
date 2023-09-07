class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            // b
            ListNode tmpCurr = curr.next;
            // a -> null
            curr.next = prev;
            // prev -> a
            prev = curr;
            // curr -> b
            curr = tmpCurr;
        }
        return curr;
    }
}