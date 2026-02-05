class Solution:
    def commonFactors(self, a: int, b: int) -> int:

        f = 0
        
        t = min(a, b)


        for i in range(1, t + 1):
            if (a % i == 0) and (b % i == 0):
                f += 1
        return f