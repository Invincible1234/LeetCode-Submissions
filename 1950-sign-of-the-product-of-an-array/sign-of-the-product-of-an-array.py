class Solution:
    def arraySign(self, nums: List[int]) -> int:

        s = math.prod(nums)

        if s == 0:
            return 0
        elif s < 0:
            return -1
        elif s > 0:
            return 1
        