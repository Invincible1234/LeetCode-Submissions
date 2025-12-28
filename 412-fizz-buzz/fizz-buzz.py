class Solution(object):
    def fizzBuzz(self, n):
        j = []

        for i in range(1, n+1):
            if i % 5 == i % 3 == 0:
                j.append("FizzBuzz")
            elif i % 3 == 0:
                j.append("Fizz")
            elif i % 5 == 0:
                j.append("Buzz")
            else:
                j.append(str(i))
        return j
        