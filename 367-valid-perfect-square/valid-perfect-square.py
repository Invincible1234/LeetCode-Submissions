class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        i = 1
        j = num

        if num == 0:
            return False

        while i <= j:
            m = (i + j) // 2

            if m*m == num:
                return True
            elif m*m < num:
                i = m+1
            elif m*m > num:
                j = m-1
        return False