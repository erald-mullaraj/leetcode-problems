class Solution:
    def isPalindrome(self, x: int) -> bool:
        strNr = str(x)[::-1]
        if strNr == str(x):
            return True
        else:
            return False
        
class Solution2:
    def isPalindrome(self, x):
        x=str(x)
        return x == x[::-1]

s = Solution()
print(s.isPalindrome(12321))
