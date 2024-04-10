from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        n = 0
        t = head
        while t != None:
            t = t.next
            n += 1
        n = n//2
        while n > 0:
            head = head.next
            n -= 1
        return head
    
    def middleNode2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        t = head
        while t and t.next: 
            t = t.next.next
            head = head.next
        return head