from typing import List

class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        d = dict()
        for i, ch in enumerate(order):
            d[ch] = i
        for i in range(len(words) - 1):
            l = 0
            while l < len(words[i]) and l < len(words[i + 1]):
                if d[words[i][l]] < d[words[i + 1][l]]:
                    break
                elif d[words[i][l]] > d[words[i + 1][l]]:
                    return False
                l += 1
            if  l == len(words[i + 1]) and l < len(words[i]):
                return False
        return True

s = Solution()
a = ["app","app","ebb"]
b = "hlabcdefgijkmnopqrstuvwxyz"
print(s.isAlienSorted(a ,b))