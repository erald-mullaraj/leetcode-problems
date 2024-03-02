class Solution:
    def minCostClimbingStairs(self, cost: list[int]) -> int:
        s = len(cost)
        for i in range(2, s):
            cost[i] += cost [i - 1] if (cost[i - 1] <= cost[i - 2]) else cost [i - 2]

        return cost [s - 1] if (cost[s - 1] <= cost[s - 2]) else cost [s - 2]
    
    def minCostClimbingStairs2(self, cost: list[int]) -> int:
        f = 0
        s = 0
        for  i in range(len(cost) - 1, -1, -1):
            cost[i] += f if f <= s else s
            s = f
            f = cost[i]
        
        return cost[0] if cost[0] <= cost[1] else cost[1]

    
s = Solution()
print(s.minCostClimbingStairs2([1,100,1,1,1,100,1,1,100,1]))