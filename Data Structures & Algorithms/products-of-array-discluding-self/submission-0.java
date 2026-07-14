class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int pre[]=new int[len];
        int suf[]=new int[len];
        int res[]=new int[len];
        pre[0]=1; suf[len-1]=1;
        for(int i=1; i<len; i++) pre[i]=pre[i-1]*nums[i-1];
        for(int i=len-2; i>=0; i--) suf[i]=suf[i+1]*nums[i+1];
        for(int i=0; i<len; i++) res[i]=pre[i]*suf[i];
        return res;
    }
}  
