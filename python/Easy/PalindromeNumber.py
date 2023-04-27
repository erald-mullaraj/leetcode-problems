class Solution:
    def isPalindrome(self, x: int) -> bool:
        strNr = str(x)[::-1]
        if strNr == str(x):
            return True
        else:
            return False

s = Solution()
print(s.isPalindrome(12321))
