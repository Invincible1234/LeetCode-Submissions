class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        
        arr = [int(num) for num in str(n)]

        s = math.prod(arr)

        total = s - sum(arr)

        return total