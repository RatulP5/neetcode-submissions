class Solution {
    public String minWindow(String s, String t) {
        char[] sc=s.toCharArray(); char[] tc=t.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		for(char c: tc) hm.merge(c, 1, Integer::sum);
		int l=0, count=0, minLen=Integer.MAX_VALUE, reqMatch=hm.size();
		String res="";
		for(int r=0; r<sc.length; r++){
			if(hm.containsKey(sc[r])){
				hm.put(sc[r], hm.get(sc[r])-1);
				if(hm.get(sc[r])==0) count++;
			}
			while(count==reqMatch){
				if(r-l+1 < minLen){
					res=s.substring(l, r+1);
					minLen=r-l+1;
				}
				if(hm.containsKey(sc[l])){
					if(hm.get(sc[l])==0) count--;
					hm.put(sc[l], hm.get(sc[l])+1);
				}
				l++;
			}
		}
		return res;
    }
}
