class Solution {
    public int search(int[] nums, int target) {
        int min=findMin(nums);
        return Math.max(coolBinSearch(nums, target, min, nums.length-1),coolBinSearch(nums, target, 0, min));
    }
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]<nums[r]) return l;
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[l]) l=mid+1;
            else r=mid;  
        }
        return l;
    }
    public int coolBinSearch(int[] nums, int k, int l, int r){
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==k) return m;
            else if(k>nums[m]) l=m+1;
            else r=m-1;
        }
        return -1;
    }
}
