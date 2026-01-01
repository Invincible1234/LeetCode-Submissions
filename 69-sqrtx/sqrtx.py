class Solution:
    def mySqrt(self, x: int) -> int:
        l = 1
        g = x


        if x == 0:
            return 0

        while l <= g:
            m = (l+g) // 2

            if m**2 == x:
                return m
            elif m**2 < x:
                l = m+1
            elif m**2 > x:
                g = m-1
        return g