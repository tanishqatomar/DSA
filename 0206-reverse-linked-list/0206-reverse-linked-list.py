# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        previous = None
        while head is not None:
            next_node = head.next
            head.next = previous
            previous = head
            head = next_node
        return previous
        """
        :type head: ListNode
        :rtype: ListNode
        """
        