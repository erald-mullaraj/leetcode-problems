class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        i = len(digits) - 1
        f = digits[0]
        while digits[i] == 9:
            digits[i] = 0
            i -= 1
        if f:
            if not digits[0]:
                return [1] + digits
        digits[i] += 1
        return digits
    
    def plusOne3(self, digits: list[int]) -> list[int]:
        l = len(digits) - 1 
        for i in range(l, -1, -1):
            if digits[i] == 9: digits[i] = 0
            else:
                digits[i] += 1
                return digits
            
        return [1] + digits

        
    
s = Solution()
print(s.plusOne3([9, 9]))