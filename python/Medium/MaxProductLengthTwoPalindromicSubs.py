from functools import cache

class Solution:
    def maxProduct(self, s: str) -> int:
        l = len(s)
        p = {}
        for m in range(1, 1 << l):
            sbs = ""
            for i in range(l):
                if m & (1 << i):
                    sbs += s[i]
            if sbs == sbs[::-1]:
                p[m] = len(sbs)
        
        r = 0
        for m1 in p:
            for m2 in p:
                if m1 & m2 == 0:
                    r = r if ( r >= p[m1] * p[m2]) else p[m1] * p[m2]
        return r

s = Solution()
a = "absdckdkeiakf"
print(s.maxProduct(a))

class Solution3: 
    def maxProduct(self, s: str) -> int:
        @cache
        def plen(sbs):
            if len(sbs) == 0:
                return 0
            if len(sbs) == 1:
                return 1
            else:
                return plen(sbs[1:-1]) + 2 if sbs[0] == sbs[-1] else max(plen(sbs[1:]), plen(sbs[:-1]))
            
        def sbsclc(s1, s2, i):
            nonlocal r
            if i == len(s):
                r = max(r, plen(s1) * plen(s2))
                return
            sbsclc(s1 + s[i], s2, i + 1)
            sbsclc(s1, s2 + s[i], i + 1)
        r = 0
        sbsclc('','',0)
        return r
    
s = Solution3()
a = "absdckdkeiakf"
print(s.maxProduct(a))

                    