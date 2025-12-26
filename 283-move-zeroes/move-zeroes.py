class Solution(object):
    def moveZeroes(self, nums):
        left = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp
                left += 1
        return nums
        