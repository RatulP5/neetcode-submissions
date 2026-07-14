class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sd={}
        for i in s:
            if i in sd:
                sd[i]+=1
            else:
                sd[i]=1
        for i in t:
            if i in sd:
                sd[i]-=1
            else:
                print('a')
                return False
        print(sd)
        for i in sd:
            if sd[i]!=0:
                print('b')
                return False
        return True



        
        