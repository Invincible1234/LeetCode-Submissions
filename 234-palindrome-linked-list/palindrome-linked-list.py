# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        arr = []
        freq = 0

        curr = head

        while curr:
            arr.append(curr.val)
            curr = curr.next

        i = 0
        j = len(arr) - 1

        if len(arr) == 1:
            return True

        while i < j:
            if arr[i] == arr[j]:
                i += 1
                j -= 1
            else:
                return False
        return True
            