# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        previous_node = None
        current_node = head
        next_node = None

        while current_node:

            next_node = current_node.next

            current_node.next = previous_node #reverse

            previous_node = current_node
            current_node = next_node
                        
        return previous_node