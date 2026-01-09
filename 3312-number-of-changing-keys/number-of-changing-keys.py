class Solution:
    def countKeyChanges(self, s: str) -> int:
        st = s.lower()
        count = 0

        for ch in range(0, len(st)-1):
            if st[ch] != st[ch + 1]:
                count +=1
        return count