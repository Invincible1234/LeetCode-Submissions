class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:

        freq = 0
        
        for sentence in sentences:

            space = sentence.count(" ")
            words = space + 1
            freq = max(freq, words)

        return freq