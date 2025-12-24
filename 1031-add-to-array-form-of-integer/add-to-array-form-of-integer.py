class Solution(object):
    def addToArrayForm(self, num, k):
        
        word = int(''.join(map(str,num)))

        word = word + k

        arr = [int(digit) for digit in str(word)]

        return arr


        