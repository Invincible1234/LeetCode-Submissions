class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        wordx = ''.join(word1)

        wordy = ''.join(word2)

        if wordx == wordy:
            return True
        else:
            return False

        