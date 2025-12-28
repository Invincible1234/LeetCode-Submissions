class Solution(object):
    def singleNumber(self, nums):
        nums.sort()
        

        for i in range(len(nums)):
            if len(nums) == 1:
                return nums[i]
            elif nums.count(nums[i]) < 2:
                return nums[i]

        
