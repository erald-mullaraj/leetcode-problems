class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        len_sstr = 1
        if len(s) <= 1:
            return len_sstr
        for j in range(len(s)):
            i = 0
            length = 1
            try:
                while i < len(s[j:])-1 :
                    if s[i + j+1] in s[j:i + j+1]:
                        raise Exception()
                    length += 1
                    if length > len_sstr:
                        len_sstr = length
                    if len_sstr > len(s) - j:
                        return len_sstr
                    print(f"info: i:{i}  str: {s[j:]}  srch:{s[i + j + 1]} substr: {s[j:i + j + 1]}")
                    i += 1
                return len_sstr
            except Exception:
                continue


s = Solution()
print(s.lengthOfLongestSubstring(''))

# print(f"info: i:{i}  str: {s[idx_s:]}  srch:{s[i + idx_s+1]} substr: {s[idx_s:i + idx_s+1]}")

class Solution2:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # make map for the letters
        alphabet = {}
        # make ans var
        ans = 0
        # get len of input
        n = len(s)
        # make start ptr will be where non repeating substring starts
        start = 0

        # enumerate input
        for index, letter in enumerate(s):
            # if curr char in map
            if letter in alphabet:
                # get val of char in map (that char index) + 1 and store in sums var
                # so sums is next index
                sums = alphabet[letter] + 1

                # if sums var > start
                if sums > start:
                    # update start, because start will be be where ans begins
                    start = sums

            # make num var set to index - start + 1
            # getting len here
            num = index - start + 1

            # if num(aka the len) > ans
            if num > ans:
                # update ans
                ans = num

            # put letter in map with index as val
            alphabet[letter] = index

        # return ans
        return ans


class Solution3:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # key: character, value: last index it was seen at
        char_map = {}
        left = 0
        longest_substring_len = 0

        for right, char in enumerate(s):
            if char in char_map and char_map[char] >= left:
                left = char_map[char] + 1  # shorten left side of sliding window to past the character
            char_map[char] = right

            current_len = right - left + 1
            if current_len > longest_substring_len:
                longest_substring_len = current_len
        return longest_substring_len


class Solution4:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a = ""
        m = []
        for i in s:
            if i not in a:
                a += i
            else:
                m.append(len(a))
                n = a.find(i)
                a = a[n + 1:]
                a += i
        m.append(len(a))
        return max(m)
