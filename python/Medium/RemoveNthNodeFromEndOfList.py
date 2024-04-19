from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        s = t = ListNode(1, head)
        f = head

        for i in range(n):
            f = f.next

        while f != None:
            f = f.next
            s = s.next
        
        s.next = s.next.next
        return t.next