class Solution:
    def minimumDeletions(self, s: str) -> int:
        
        arr = list(s)

        deletions = 0
        b = 0

        for c in arr:
            if c == 'b':
                b += 1
            else:
                if b > 0:
                    deletions += 1
                    b -= 1

        return deletions

