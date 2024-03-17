class Solution:
    def isHappy(self, n: int) -> bool:
        b = {4, 16, 20, 37, 42, 58, 89, 145}
        if n in b:
            return False
        a = 0
        while n != 1:
            a = 0
            while n:
                a += (n%10)**2
                n //= 10
            print(a)
            if a in b: return False
            n = a
        return True
    
s = Solution()
print(s.isHappy(6))