class Solution:
    def countOdds(self, low: int, high: int) -> int:
        return int((high + 1)/2) - int(low/2)
    
    def countOdds2(self, low: int, high: int) -> int:
        return int((high-low)/2) if not high%2 and not low%2 else int((high-low)/2 + 1)
    
s = Solution()
print(s.countOdds2(3, 5))