class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) :
            return False
        s_count = [0]*26
        t_count = [0]*26
        for i in range(len(s)) :
            char_s = s[i]
            char_t = t[i]
            s_count[ord(char_s) - ord('a')] += 1
            t_count[ord(char_t) - ord('a')] += 1
        for i in range(len(s_count)) :
            if(s_count[i] != t_count[i]):
                return False
        
        return True
