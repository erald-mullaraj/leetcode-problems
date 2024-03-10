class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        a, b = len(str1), len(str2)
        if str1 + str2 != str2 + str1:
            return ""
        l = b if b < a else a
        if not a%l and not b%l:
            return str1[:l]
        for i in range(l//2, 0, -1):
            if not a%i and not b%i:
                return str1[:i]
        
s = Solution()
a = "ABABAB"
b = "ABAB"
print(s.gcdOfStrings(a, b))