class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) : 
            return False

        numbers = {}
        for c in s:
            numbers[c] = numbers.get(c,0)+1

        for c in t:
            if c not in numbers or numbers[c]==0:
                return False
            numbers[c] -= 1

        return True
 