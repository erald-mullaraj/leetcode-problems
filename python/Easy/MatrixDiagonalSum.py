class Solution:
    def diagonalSum(self, mat: list[list[int]]) -> int:
        l = len(mat)
        r = 0
        for i in range(l):
            r += mat[i][i] + mat[l-i-1][i]
        if l%2:
            return r - mat[int(l/2)][int(l/2)]
        return r
    
s = Solution()
a = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print(s.diagonalSum(a))