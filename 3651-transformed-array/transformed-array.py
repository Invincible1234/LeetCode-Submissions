class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:

        result = [0] * len(nums)

        target_index = 0

        for i in range(len(nums)):
            if nums[i] > 0:
                target_index = ((i + nums[i]) % len(nums))
                result[i] = nums[target_index]
            elif nums[i] < 0:
                target_index = ((i + nums[i]) % len(nums))
                result[i] = nums[target_index]
            elif nums[i] == 0:
                result[i] = nums[i]

        return result
