package Easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode fp = head;
        ListNode sp = head;

        while(fp != null && sp != null){
            fp = fp.next.next;
            sp = sp.next;
        }

        ListNode prv = null;
        while(sp != null){
            // tmp - b
            ListNode tmp = sp.next;
            // a - null
            sp.next = prv;
            // prv - a
            prv = sp;
            // sp - b
            sp = tmp;
        }

        ListNode lf = head;
        ListNode rt = prv;
        while(rt != null){
            if(lf.val != rt.val){
                return false;
            }
            rt = rt.next;
            lf = lf.next;
        }
        return true;
    }
}