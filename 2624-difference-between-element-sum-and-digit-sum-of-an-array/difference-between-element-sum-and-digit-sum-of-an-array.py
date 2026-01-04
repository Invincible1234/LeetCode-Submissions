class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        
        total = sum(nums)
        element = 0

        for i in nums:
            for digits in str(i):
                element += int(digits)

        s = total - element

        return abs(s)