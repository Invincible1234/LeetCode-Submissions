class Solution(object):
    def findFinalValue(self, nums, original):
       nums.sort()

       while original in nums:
          original *= 2

       return original
        