class Solution:
    def longestPalindrome(self, s: str) -> str:
        def isPalindrom(str):
            rivStr = str[::-1]
            if rivStr == str:
                return True
            else:
                return False
        n = len(s)
        for i in range(n):
            for j in range(i+1):
                if isPalindrom(s[j:(n - i+j)]):
                    return s[j:(n - i+j)]


s = Solution()
print(s.longestPalindrome("civilwartestingwh"))

class Solution2:
    def longestPalindrome(self, s: str) -> str:
        if s == s[::-1]:
            return s
        start, size = 0, 1
        for i in range(1, len(s)):
            l, r = i - size, i + 1
            s1, s2 = s[l-1:r], s[l:r]
            if l >= 1 and s1 == s1[::-1]:
                size += 2
                start = l - 1
            elif s2 == s2[::-1]:
                size += 1
                start = l

        return s[start: start + size]


class Solution3:

    def longestPalindrome(self, s: str) -> str:

        n = len(s)
        l = 0
        res = ''

        def helper(l, r):

            while l >= 0 and r < n and s[l] == s[r]:
                l -= 1
                r += 1

            return s[l + 1:r]

        for i in range(len(s)):
            res = max(helper(i, i), helper(i, i + 1), res, key=len)

        return res