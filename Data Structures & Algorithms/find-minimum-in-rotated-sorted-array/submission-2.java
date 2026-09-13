class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1, mid=l+(r-l)/2;
        while(l<r){
            if(nums[l]<nums[r]) return nums[l];
            mid=l+(r-l)/2;
            System.out.println(l+" "+mid+" "+r);
            if(nums[mid]>=nums[l]) l=mid+1;
            else r=mid;  
        }
        return nums[l];
    }
}
