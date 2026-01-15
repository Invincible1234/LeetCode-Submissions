class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        count = 0

        n = len(grid)

        for i in range(n):
            for j in range(len(grid[i])):
                if grid[i][j] < 0:
                    count += 1

        return count