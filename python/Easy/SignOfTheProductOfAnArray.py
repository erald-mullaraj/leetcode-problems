class Solution:
    def arraySign(self, nums: list[int]) -> int:
        r = 1
        for i in nums:
            if i == 0: return 0
            elif i < 0: r *= -1
        return r

s = Solution()
print(s.arraySign([1,-1, 2, -1, 1]))