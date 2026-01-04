class Solution:
    def countDigits(self, num: int) -> int:

        arr = [int(nom) for nom in str(num)]     
        freq = 0   

        for val in arr:
            if num % val == 0:
                freq += 1
        return freq