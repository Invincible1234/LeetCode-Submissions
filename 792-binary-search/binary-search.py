class Solution:
    def search(self, nums: List[int], target: int) -> int:
        ind = 0
        n = len(nums)
        if target not in nums:
            return -1

        for i in range(n):
            if target == nums[i]:
                ind = i


        return ind
