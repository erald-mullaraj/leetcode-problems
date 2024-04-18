package Medium;

import java.util.ArrayList;
import java.util.List;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class ReorderList {
    
    public void reorderList(ListNode head){

        ListNode a = head;
        List<ListNode> l = new ArrayList<>();

        while (a != null){
            l.add(a);
            a = a.next;
        }

        int n = l.size() - 1;

        if(n > 0) head.next = l.get(n);
        int i = 0;
        while(i < n - i - 1){
            l.get(n - i).next = l.get(i + 1);
            l.get(i+1).next = null;
            if(i < n - i - 2){
                l.get(i + 1).next = l.get(n - i - 1);
                l.get(n - i - 1).next = null;
            }
            i++;
        }
    }

    public void reorderList2(ListNode head){
        recursive(head, head);
    }

    public ListNode recursive(ListNode f, ListNode s){
        ListNode n = s.next;
        if(f == null)return s;
        if(f.next == null){
            s.next = null;
            return n;
        }
        ListNode r = recursive(f.next.next, s.next);
        n = r.next;
        r.next = s.next;
        if(s.next == r) r.next = null;
        s.next = r;
        return n;
    }  
}
