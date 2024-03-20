class Solution:
    def findDifference(self, nums1: list[int], nums2: list[int]) -> list[list[int]]:
        s1 =  list(set(nums1) - set(nums2))
        s2 =  list(set(nums2) - set(nums1))
        return [s1, s2]
    
s = Solution()
a = [1, 3, 3, 7, 4, 5]
b = [2, 4, 6, 7, 6]
print(s.findDifference(a, b))
