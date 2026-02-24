class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        i = 1
        for x in word:
            if x == ch:
                break
            i += 1
        if i == len(word) + 1:
            return word
        return word[:i][::-1] + word[i:]