class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:

        jewels = set(jewels)

        new_jews = 0

        for s in stones:
            if s in jewels:
                new_jews += 1
        return new_jews
        