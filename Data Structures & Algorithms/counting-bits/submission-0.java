class Solution {
    public int[] countBits(int n) {
        List<Integer> res=new ArrayList<>();
        for(int i=0; i<=n; i++) res.add(oneBits(i));
        return res.stream().mapToInt(i->i).toArray();
    }
    public int oneBits(int n){
        int res=0;
        while(n!=0){
            res+=n&1;
            n=n>>1;
        }
        return res;
    }
}
