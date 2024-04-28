from typing import List

class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        m = len(grid)
        n = len(grid[0])
        s = m*n
        g = [[0 for i in range(n)] for i in range(m)]

        for i in range(m):
            for j in range(n):
                idx = i*n + j + k
                nidx = idx%s
                x = nidx//n
                y = nidx%n
                g[x][y] = grid[i][j]
        return g

s = Solution()
a = [[1],[2],[3],[4],[7],[6],[5]]
print(s.shiftGrid(a, 1))