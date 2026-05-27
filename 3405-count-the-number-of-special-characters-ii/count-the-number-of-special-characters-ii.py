class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lower = [-1] * 26
        upper = [-1] * 26

        for i, ch in enumerate(word):
            if ch.islower():
                lower[ord(ch) - ord('a')] = i
            elif upper[ord(ch) - ord('A')] == -1:
                upper[ord(ch) - ord('A')] = i

        ans = 0

        for i in range(26):
            if lower[i] != -1 and upper[i] != -1 and lower[i] < upper[i]:
                ans += 1

        return ans