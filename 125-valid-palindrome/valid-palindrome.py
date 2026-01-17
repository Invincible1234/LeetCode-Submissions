class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        p = []

        for i in s:
            if i.isalnum():
                p.append(i.lower())

        x = 0
        v = len(p) - 1

        for i in range(len(p)):
            if p[x] != p[v]:
                return False

            x += 1
            v -= 1
        return True


