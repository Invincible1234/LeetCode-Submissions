class Solution(object):
    def missingNumber(self, nums):
       n = len(nums)

       newSum = (n * (n + 1)) // 2

       actSum = sum(nums)

       return newSum - actSum