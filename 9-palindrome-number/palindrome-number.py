class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        arr = [str(v) for v in str(x)]

        i = 0

        j = len(arr) - 1

        while i < j:
            if arr[i] == arr[j]:
                i += 1
                j -= 1
            else:
                return False
        return True