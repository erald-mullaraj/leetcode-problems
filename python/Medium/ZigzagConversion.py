class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        l = len(s)
        m = 2*(numRows-1)
        ns = ''

        for n in range(numRows):
            if n%numRows == 0 or n%numRows == numRows - 1:
                for i in range(n,l,m):
                    ns += s[i]
            else:
                for j in range(n,l,m):
                    ns += s[j]
                    j2 = j + m - 2 * (j % m)
                    if j2 <= l-1:
                        ns += s[j2]
        return ns


s = Solution()
print(s.convert('PAYPALISHIRING',4))

class Solution2:
    def convert(self, st: str, numRows: int) -> str:
        if numRows == 1 or len(st) <= numRows:
            return st
        L = [''] * numRows
        i, s = 0 ,1
        for ss in st:
            L[i] += ss
            if i == 0:
                s = 1
            elif i >= numRows - 1:
                s = -1
            i += s
        return ''.join(L)

class Solution3:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        index = 0
        rows = [''] * numRows
        for char in s:
            rows[index] += char
            if index == 0:
                step = 1
            elif index == numRows - 1:
                step = -1
            index += step
        return ''.join(rows)


