class Solution:
    def convertToTitle(self, c: int) -> str:
        r = ""
        while c > 0:
            c -= 1
            r = chr((c%26) + 65) + r
            c //= 26
        return r
    
s = Solution()
print(s.convertToTitle(28))


