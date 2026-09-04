class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int count=0;
        for(int i=nums.length-2; i>=0; i--){
            count++;          
            if(nums[i]>=count) count=0;
        }
        if(count!=0) return false;
        return true;
    }
}
