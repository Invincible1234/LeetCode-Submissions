class Solution(object):
    def lengthOfLastWord(self, s):
        word = s.split()
        lst = []
        
        for i in word:
            lst.append(i)

        return len(lst[-1])
        