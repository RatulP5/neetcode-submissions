class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<Character>();
        char[] str=s.toCharArray();
        int count=0, maxCount=0, l=0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(str[i])){
                while(str[l]!=str[i]){
                    hs.remove(str[l]);
                    l++;
                    count--;
                }
                l++;
            }else{	
                count++;
                if(count>maxCount) maxCount=count;
                hs.add(str[i]);
            }
        }
        return maxCount;
        }
}
