class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        int maxCount=0, count=0;
        for(int i:nums) hs.add(i);
        for(int i: hs.stream().toList()){
            count=0;
            if(!hs.contains(i-1)){
                while(hs.contains(i++)) count++;
                maxCount=Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
