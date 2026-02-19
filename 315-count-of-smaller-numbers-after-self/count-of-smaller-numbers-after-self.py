class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        s = SortedList()
        ans = []
        for n in reversed(nums):
            ans.append(s.bisect_left(n))
            s.add(n)
        return ans[::-1]