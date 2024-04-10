package Easy;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode t = head;
        while(t != null){
            t = t.next;
            n++;
        }
        System.out.println(n);
        n = n/2;
        while(n>0){
            head = head.next;
            n--;
        }
        return head;
    }
}