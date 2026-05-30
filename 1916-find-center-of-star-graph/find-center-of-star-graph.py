class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        if edges[1][0] in edges[0]:
            return edges[1][0]
        else:
            return edges[1][1]