class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        even = None
        even = Counter(i for i in nums if i % 2 == 0)
        maxCount = 0
        result = -1

        for num, freq in even.items():
            if freq > maxCount or (freq == maxCount and num < result):
                result = num
                maxCount = freq
        return result