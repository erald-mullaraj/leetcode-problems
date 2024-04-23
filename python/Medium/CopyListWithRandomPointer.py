from typing import Optional

class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
 

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':

        t = head
        m = {None: None}
        while t:
            m[t] = Node(t.val)
            t = t.next

        t = head
        while t:
            n = m[t]
            n.next = m[t.next]
            n.random = m[t.random]
            t = t.next

        return m[head]
    
    def copyRandomList2(self, head: 'Optional[Node]') -> 'Optional[Node]':

        t = head
        while t:
            n = Node(t.val)
            n.next = t.next
            t.next = n
            t = t.next.next
            
        t = head
        while t:
            if t.random:
                t.next.random = t.random.next
            t = t.next.next
        n = Node(1)
        t = n
        while head:
            a = head.next.next
            n.next = head.next
            head.next = a
            n = n.next
            head = a
        return t.next