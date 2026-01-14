class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]

        n = numRows - 1

        prevRows = self.generate(n)
        newRows = [1] * numRows

        for i in range(1, n):
            newRows[i] = prevRows[-1][i - 1] + prevRows[-1][i]

        prevRows.append(newRows)
        return prevRows