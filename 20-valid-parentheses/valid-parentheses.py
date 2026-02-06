class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        d = {')' : '(', '}' : '{', ']' : '['}

        for i in s:
            if i == '(' or i == '{' or i == '[':
                stack.append(i)
            else:
                if len(stack) == 0:
                    return False
                
                top = stack.pop()
                if top != d[i]:
                    return False

        return len(stack) == 0
            