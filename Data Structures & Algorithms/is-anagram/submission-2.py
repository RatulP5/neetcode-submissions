class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sd={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] in sd:
                sd[s[i]]+=1
            else:
                sd[s[i]]=1
            if t[i] in sd:
                sd[t[i]]-=1
            else:
                sd[t[i]]=-1
        print(sd)
        for i in sd:
            if sd[i]!=0:
                return False
        return True



        
        