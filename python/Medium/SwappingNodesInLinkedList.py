from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        f = s = head
        for i in range(1, k):
            f = f.next
        tn = f
        while f.next != None:
            f = f.next
            s = s.next
        a = s.val
        s.val = tn.val
        tn.val = a
        
        return head