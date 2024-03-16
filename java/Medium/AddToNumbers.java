package Medium;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}

public class AddToNumbers {

    public static ListNode addTwoNubmers(ListNode l1, ListNode l2) {

        ListNode start = new ListNode(0);
        ListNode l3 = start;

        int temp = 0;
        while (l1 != null || l2 != null){
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int currentSum = l1Val + l2Val + temp;
            temp = currentSum/10;
            int lstNr = currentSum % 10;

            ListNode newNode = new ListNode(lstNr);
            l3.next = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if (temp > 0) {
            ListNode newNode = new ListNode(temp);
            l3.next = newNode;
            l3 = l3.next;
        }
        return start.next;
    }
}
