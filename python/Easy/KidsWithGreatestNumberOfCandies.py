class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        greatestCandiesNr = 0
        answer = []
        for i in candies:
            if i > greatestCandiesNr:
                greatestCandiesNr = i
        for j in range(len(candies)):
            if (candies[j]+extraCandies)>=greatestCandiesNr:
                answer.append(True)
            else:
                answer.append(False)
        print(answer)
        return answer

    def kidsWithCandies2(self, candies: list[int], extraCandies: int) -> list[bool]:
        max_cand = max(candies)
        return [(x + extraCandies) >= max_cand for x in candies]

    def kidsWithCandies3(self, candies: list[int], extraCandies: int) -> list[bool]:
        m = max(candies)
        return [True if c + extraCandies >= m else False for c in candies]


s = Solution()
s.kidsWithCandies([2,3,5,1,3], 3)