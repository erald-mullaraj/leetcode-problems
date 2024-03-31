class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0: return 0
        if n < 3: return 1
        r, t1, t2, t3 = 0 ,0, 1, 1
        for i in range(n-2):
            r = t1 + t2 + t3
            t1, t2, t3  = t2, t3, r
        return r
    
s = Solution()
print(s.tribonacci(5))
