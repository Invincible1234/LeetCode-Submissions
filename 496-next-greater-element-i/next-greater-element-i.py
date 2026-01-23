class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans = []

        for i in range(len(nums1)):
            val = nums1[i]
            idx = nums2.index(val)
            
            for j in range(idx + 1, len(nums2)):
                if nums2[j] > val:
                    ans.append(nums2[j])
                    break
            else:
                ans.append(-1)
                

        return ans
