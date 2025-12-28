class Solution(object):
    def singleNumber(self, nums):
        count = 0

        for n in nums:
            count ^= n
        return count

        
