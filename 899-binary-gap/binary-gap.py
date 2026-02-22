class Solution:
    def binaryGap(self, n: int) -> int:
        lp, mg = -1, 0
        bstr = bin(n)[2:]

        for i, bit in enumerate(bstr):
            if bit == '1':
                if lp!=-1:
                    mg = max(mg, i-lp)
                lp = i
        
        return mg