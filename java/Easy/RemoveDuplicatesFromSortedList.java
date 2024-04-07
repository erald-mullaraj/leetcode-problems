package Easy;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next){
        this.val = val; this.next = next;
    }
}

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            if(prev != null && prev.val == curr.val){
                curr = curr.next;
                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
