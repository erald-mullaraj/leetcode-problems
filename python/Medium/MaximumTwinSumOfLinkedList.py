from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:

    def pairSum(self, head: Optional[ListNode]) -> int:
        l = 0
        a = []
        t = head
        while t != None:
            a.append(t.val)
            l += 1
            t = t.next

        max = 0
        for i in range(0, l//2):
            if max > a[i] + a[l - i- 1]: max = max
            else: max = a[i] + a[l - i- 1]

        return max
    
    def pairSum2(self, head: Optional[ListNode]) -> int:
        l = 0
        max = 0
        a = []
        s, f = head, head
        while s:
            if f:
                l += 1
                a.append(s.val)
                f = f.next.next
                s = s.next
            else:
                l -= 1
                a[l] += s.val
                if a[l] > max: max = a[l]
                s = s.next

        return max
    
    def pairSum3(self, head: Optional[ListNode]) -> int:

        max = 0
        s, f = head, head
        p = None
        while f:
            f = f.next.next
            t = s.next
            s.next = p
            p = s
            s = t
        while s:
            if p.val + s.val > max: max = p.val + s.val
            s = s.next
            p = p.next

        return max