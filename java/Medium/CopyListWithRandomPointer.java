package Medium;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    
    public Node copyRandomList(Node head) {

        Node t = head;
        Map<Node, Node> mp = new HashMap<>();

        while (t != null) {
            mp.put(t, new Node(t.val));
            t = t.next;
        }

        t = head;
        while (t != null){
            mp.get(t).next = mp.get(t.next);
            mp.get(t).random = mp.get(t.random);
            t = t.next;
        }
        
        return mp.get(head);
    }
}