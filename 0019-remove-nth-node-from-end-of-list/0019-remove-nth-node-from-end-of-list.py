# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        p = head
        q = head
        for i in range(0,n):
            p = p.next
        if not p:
            return head.next
        while p.next is not None:
            p = p.next
            q = q.next
        q.next = q.next.next
        return head
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        