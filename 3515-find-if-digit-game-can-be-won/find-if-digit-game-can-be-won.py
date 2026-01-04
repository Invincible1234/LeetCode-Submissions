class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        
        singly = [element for element in nums if element < 10]

        doubly = [freq for freq in nums if freq >= 10]

       
        return sum(singly) != sum(doubly)
