class Solution:
    def longestValidParentheses(self, s: str) -> int:
        ml= t = 0
        l = r = 0

        for i in range(len(s)):
            if s[i] == '(':
                l += 1
            else:
                r +=1
            if l == r:
                t = r * 2
                if t > ml:
                    ml = t
                    t = 0
            elif r > l:
                l = r = 0
        l = r = 0
        for i in range(len(s)-1,-1,-1):
            if s[i] == '(':
                l += 1
            else:
                r +=1
            if l == r:
                t = r * 2
                if t > ml:
                    ml = t
                    t = 0
            elif l > r:
                l = r = 0
        return ml

s = Solution()
print(s.longestValidParentheses('(()((())))()()((()()()))(('))
