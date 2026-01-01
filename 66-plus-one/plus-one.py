class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num = int(''.join(map(str,digits)))

        num += 1

        arr  = [int(nom) for nom in str(num)]

        return arr