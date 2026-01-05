class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        nums.sort()

        r = []

        for i in range(len(nums)):
            if nums[i] == target:
                r.append(i)

        return r
        
        

    
