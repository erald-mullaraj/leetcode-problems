package Medium;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MaximumTwinSumOfLinkedList {

public int pairSum(ListNode head){

    ListNode t = head;
    int max = 0;
    int l = 0;

    while(t != null){
        l++;
        t = t.next;
    }
    int[] a = new int[l/2];
    int i = 0;
    int idx = 0;
    while( head != null){
        if(idx < (l)/2){
            a[i] += head.val;
            max = max > a[i] ? max : a[i];
            i++;
        } else {
            i--;
            a[i] += head.val;
            max = max > a[i] ? max : a[i];
        }
        idx++;
        head = head.next;
    }

    return max;
}
}
