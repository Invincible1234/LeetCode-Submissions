class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        arr = []

        for i in accounts:
            arr.append(sum(i))

        return max(arr)