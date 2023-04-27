class Solution:
    def myAtoi(self, s: str) -> int:
        st = '0'
        sng = ''
        rl = -2**31
        ll = 2**31-1

        for i in range(len(s)):
            if s[i] == ' ':
                continue
            if s[i] == '-' or s[i] == '+' :
                sng = s[i]
                for m in range(i+1,len(s)):
                    if s[m] in '0123456789':
                        st += s[m]
                    else:
                        break
                if int(sng + st) > ll:
                    return ll
                elif int(sng + st) < rl:
                    return rl
                return int(sng + st)
            if s[i] in '0123456789':
                for m in range(i,len(s)):
                    if s[m] not in '0123456789':
                        break
                    st += s[m]
                if int(sng + st) > ll:
                    return ll
                elif int(sng + st) < rl:
                    return rl
                return int(sng + st)
            return 0
        return 0

s = Solution()
print(s.myAtoi("   -01278uio3 123"))

class Solution2:
    def myAtoi(self, s: str) -> int:
        num, i, sign = 0, 0, 1
        while i < len(s) and s[i] == ' ':
            i += 1
        if i < len(s) and (s[i] == '-' or s[i] == '+'):
            sign = 1 if s[i] == '+' else -1
            i += 1
        while i < len(s) and s[i].isdigit():
            digit = int(s[i])
            if (num > 2147483647 // 10) or (num == 2147483647 // 10 and digit > 7):
                return 2147483647 if sign == 1 else -2147483648
            num = (num * 10) + digit
            i += 1
        return num * sign