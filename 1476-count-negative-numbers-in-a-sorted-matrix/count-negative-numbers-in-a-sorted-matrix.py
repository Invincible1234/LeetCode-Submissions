class Solution(object):
    def countNegatives(self, grid):

        neg = 0
        
        for i in grid:
            for j in i:
                if j < 0:
                    neg += 1

        return neg
        