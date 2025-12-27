class Solution(object):
    def tribonacci(self, n):
        f = [0] * 38
        f[0] = 0
        f[1] = 1
        f[2] = 1

        for i in range(3, n+1):
            f[i] = f[i-1] + f[i-2] + f[i-3]
            
        return f[n]

           
        