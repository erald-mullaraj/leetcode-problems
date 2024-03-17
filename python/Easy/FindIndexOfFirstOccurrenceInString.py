class Soltuion:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack) - len(needle) + 1):
            if haystack[i] == needle[0]:
                for j in range(0, len(needle)):
                    if haystack[j+i] != needle[j]:
                        break
                else:
                    return i
        return -1
    
    def strStr2(self, haystack: str, needle: str) -> int:
        return haystack.find(needle)
    
s = Soltuion()

print(s.strStr2("qwerqerq", "qer"))