class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        
        singly = sum([element for element in nums if element < 10])

        doubly = sum([freq for freq in nums if freq >= 10])

       
        return singly != doubly
