class Solution:
    def romanToInt(self, s: str) -> int:
        r = 0
        n = 0
        pr = 0
        
        for i in reversed(s):
            if i == "I": n = 1
            elif i == "V": n = 5
            elif i == "X": n = 10
            elif i == "L": n = 50
            elif i == "C": n = 100
            elif i == "D": n = 500
            elif i == "M": n = 1000

            if n < pr: r -= n
            else: r += n
            pr = n
        return r
    
    def romanToInt2(self, s: str) -> int:
        r = 0
        p = 0
        d = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        l = len(s)
        for i in range(len(s) - 1, -1, -1):
            if(p > d[s[i]]): r -= d[s[i]]
            else:
                r += d[s[i]]
            p = d[s[i]]
        return r


s = Solution()
print(s.romanToInt2("MCMXCIV"))
