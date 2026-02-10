class Solution:
    def sortString(self, s: str) -> str:
        cunt = collections.Counter(s)
        ans = []

        while len(ans) < len(s):
            for mc in (sorted(cunt), sorted(cunt, reverse = True)):
                for i in mc:
                    if cunt[i] > 0:
                        ans.append(i)
                        cunt[i] -=1

        return ''.join(ans)