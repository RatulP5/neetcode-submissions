class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0, maxSize=0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            map.merge(arr[i], 1, Integer::sum);
            int maxFreq=Collections.max(map.values());
            if(((i-l+1)-maxFreq) > k){
                map.put(arr[l], map.get(arr[l]) - 1);
                l++;
            }
            int size=i-l+1;
            if(size>maxSize) maxSize=size;
            System.out.println(size + " " + maxFreq + " " + l);

        }
        
        return maxSize;    
    }
}
