class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:

        arr1 = []
        arr2 = []

        num1 = 0
        num2 = 0

        total = None

        for i in range(1, n+1):
            if i % m == 0:
                arr1.append(i)
            elif i % m != 0:
                arr2.append(i)

        total = sum(arr2) - sum(arr1) 
        return total
        