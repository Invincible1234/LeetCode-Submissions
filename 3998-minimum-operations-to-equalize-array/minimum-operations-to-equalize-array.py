class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = set(nums)

        if len(n) == 1:
            return 0
        else:
            return 1