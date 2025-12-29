class Solution(object):
    def repeatedNTimes(self, nums):
       return int((sum(nums)-sum(set(nums))) // (len(nums)//2-1))