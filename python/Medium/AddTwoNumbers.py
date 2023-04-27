# Definition for singly-linked list.


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def add_elem(self, val):
        new_node = ListNode(val)
        temp = ListNode()
        while temp.next!=None:
            temp = temp.next
        temp.next = new_node

    def length(self):
        temp = ListNode()
        total = 0
        while temp.next!= None:
            total+=1
            temp = temp.next
        return total

    def display(self):
        elems = []
        cur_node = ListNode()
        while cur_node.next!=None:
            cur_node=cur_node.next
            elems.append(cur_node.data)
        print (elems)


    def get_value(self, index):
        if index >= self.length():
            print("Error")
            return None
        cur_index = 0
        cur_node = ListNode()
        while True:
            cur_node = cur_node.next
            if cur_index == index: return cur_node.data
            cur_index += 1



class Solution:
    def addTwoNumbers(self, l1: [ListNode], l2: [ListNode]) -> [ListNode]:
        str1 = ''
        str2 = ''
        lst = []
        for i in range(len(l1)-1,-1,-1):
            str1 += str(l1[i])
        for j in range(len(l2) - 1, -1, -1):
            str2 += str(l2[j])
        str3 = str((int(str1) + int(str2)))
        for k in range(len(str3) - 1, -1, -1):
            lst.append(int(str3[k]))
        return lst
        print(lst)


s = Solution()
s.addTwoNumbers( [2, 7, 1, 5],  [2, 7, 1, 5])