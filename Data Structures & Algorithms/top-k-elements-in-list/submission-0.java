class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: nums) map.merge(i, 1, Integer::sum);   //(a,b)->Integer.sum(a,b)
        System.out.println(map);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0; i<=nums.length; i++) list.add(new ArrayList<Integer>());
        for(Integer i: map.keySet()){
            int idx=map.get(i);
            System.out.println(idx);
            list.get(idx).add(i);
        }
        int[] res=new int[k];
        int count=0, flag=0;
        for(int i=nums.length; i>=0; i--){
            for(int j=0; j<list.get(i).size(); j++){
                res[count++]=list.get(i).get(j);
                if(count==k){ flag=1; break; }
            }
            if(flag==1) break;
        }
        return res;
    }
}
