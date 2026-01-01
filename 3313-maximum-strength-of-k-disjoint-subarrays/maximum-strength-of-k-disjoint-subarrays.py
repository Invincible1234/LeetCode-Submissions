class Solution:
    def maximumStrength(self, nums: List[int], k: int) -> int:
        n = len(nums)
        current = [-float('inf')] * (k+1)
        overall = [-float('inf')] * (k+1)
        overall[0] = 0

        for i in nums:
            for j in range(k, 0, -1):
                weight = k - j + 1
                if j%2 == 0:
                    weight = -weight
                val = weight * i

                current[j] = max(current[j] + val, overall[j-1] + val)
                overall[j] = max(current[j], overall[j])

        return overall[k]
                


