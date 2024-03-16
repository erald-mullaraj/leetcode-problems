package Easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val; }
    ListNode(int val, ListNode next) {
         this.val = val; this.next = next; }
 }

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
        ListNode start = new ListNode(0);
        ListNode l3 = start;
        
        while (list1 != null && list2 != null){
            
                if (list1.val < list2.val) {
                    ListNode newNode = new ListNode(list1.val);
                    l3.next = newNode;
                    l3 = l3.next;
                    list1 = list1.next;
                } else {
                    ListNode newNode = new ListNode(list2.val);
                    l3.next = newNode;
                    l3 = l3.next;
                    list2 = list2.next;
                }  
            }
        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            l3.next = newNode;
            l3 = l3.next;
            list1 = list1.next;
            
        }
        while (list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            l3.next = newNode;
            l3 = l3.next;
            list2 = list2.next;
        }
        return start.next;
    }  
}
