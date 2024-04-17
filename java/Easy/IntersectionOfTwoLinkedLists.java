package Easy;

import java.util.ArrayList;
import java.util.List;

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode h1 = new ListNode(3);
        ListNode h2 = new ListNode(2);
        h2.next = h1;

        System.out.println(getIntersectionNode(h1, h2).val);

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        List<ListNode> lA = new ArrayList<>();
        List<ListNode> lB = new ArrayList<>();
        ListNode tA = headA;
        ListNode tB = headB;
        
        while(tA != null){
            lA.add(tA);
            tA = tA.next;
        }
        while(tB != null){
            lB.add(tB);
            tB = tB.next;
        }

        int a = lA.size() - 1;
        int b = lB.size() - 1;

        if(lA.get(a) != lB.get(b)){
            return null;
        }

        while(a >= 0 && b >= 0){
            if(lA.get(a) == lB.get(b)){
                a--;
                b--;
            } else {
                return lA.get(a + 1);
            }
        }
        return lA.get(a + 1);
    }
}
