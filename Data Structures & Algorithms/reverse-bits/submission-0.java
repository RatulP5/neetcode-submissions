class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0; i<32; i++){
            int b=n&1;
            b=b<<(31-i);
            res=res|b;
            n=n>>1;
        }
        return res;     
    }
}
