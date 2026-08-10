class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] car = new int[26];
        StringBuilder hash= new StringBuilder();
        Map<String, List<String>> hm=new HashMap<>();
        
        for(String s: strs){
            hash.setLength(0); //reset
            Arrays.fill(car, 0);
            for(char c: s.toCharArray()){ //create freq
                car[(int)c - (int)'a'] +=1;
            }
            for(int i: car){ //create key
                hash.append(i);
                hash.append("#");
            }
            String hashKey=hash.toString();
            if(hm.containsKey(hashKey)) hm.get(hashKey).add(s);
            else hm.put(hashKey, new ArrayList<>(Arrays.asList(s)));
        }
        return new ArrayList<>(hm.values());
    }
}
