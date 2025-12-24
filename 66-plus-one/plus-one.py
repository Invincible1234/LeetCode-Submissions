class Solution(object):
    def plusOne(self, digits):
        num = int(''.join(map(str,digits)))

        num += 1

        arr = [int(nom) for nom in str(num)]

        return arr
        