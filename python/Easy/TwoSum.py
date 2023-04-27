class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:

        for int in range(len(nums)):
            for i in range(1, len(nums) - int):
                if nums[int] + nums[int + i] == target:
                    print([int, int+ i])


s = Solution()
s.twoSum([3,2,3], target=6)
