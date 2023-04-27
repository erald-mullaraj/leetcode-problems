class Solution:
    def reverse(self, x: int) -> int:
        if x >= 0:
            strNr = str(x)[::-1]
            if int(strNr) >= 2**31-1:
                return 0
            else:
                return int(strNr)
        else:
            strNr = str(x)[1:][::-1]
            if -1*int(strNr) <= -2**31:
                return 0
            else:
                return -1*int(strNr)

s = Solution()
print(s.reverse(-656464184))

class Solution2:
    def reverse(self, x: int) -> int:
        intMax = 2 ** 31 - 1
        intMin = -1 * 2 ** 31
        xStr = str(x) if x >= 0 else str(x)[1:]
        xRev = xStr[::-1] if x >= 0 else '-' + xStr[::-1]
        xRevInt = int(xRev)
        if xRevInt > intMax or xRevInt < intMin:
            return 0
        return xRevInt

class Solution3:
    def reverse(self, x: int) -> int:
        neg=0
        if x<0:
            neg=1
            x=abs(x)
        l=list(str(x))
        l.reverse()
        if l:
            while l[0] == '0' and len(l)>1:
                l.pop(0)
            k=int(''.join(l))
            if k>2**31-1:
                return 0
            elif neg==1:
                return -k
            else:
                return k