class Solution:
    def kthSmallestPath(self, destination: List[int], k: int) -> str:
        ans = []
        v, h = destination

        for _ in range(h+v):
            count = math.comb(h+v-1,v)
            if k <= count:
                ans.append('H')
                h -=1
            else:
                k -= count
                ans.append('V')
                v-=1

        return ''.join(ans)