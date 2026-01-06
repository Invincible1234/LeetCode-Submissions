class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged = sorted(nums1 + nums2)

        n = len(merged)

        mid = n // 2

        return float(merged[mid] if n % 2 else (merged[mid-1] + merged[mid]) / 2.0)