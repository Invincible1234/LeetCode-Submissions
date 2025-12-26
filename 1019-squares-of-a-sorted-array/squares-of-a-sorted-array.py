class Solution(object):
    def sortedSquares(self, nums):
        nums = [i ** 2 for i in nums]
        nums.sort()
        return nums