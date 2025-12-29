class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        
        newSet = {}

        for idx in range(len(nums)):
            if nums[idx] in newSet and abs(idx - newSet[nums[idx]]) <= k:
                return True
            newSet[nums[idx]] = idx

        return False
                


