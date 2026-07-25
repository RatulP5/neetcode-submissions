class Solution {
    public int maxArea(int[] heights) {
        int area=0, maxArea=0, l=0, r=heights.length-1;
        while(l<r){
            area=Math.min(heights[l], heights[r]) * (r-l);
            maxArea=Math.max(area, maxArea);
            if(heights[l] < heights[r]) l++;
            else r--;
            System.out.println(heights[l] + "  " + heights[r]);
        }
        return maxArea;
    }
}
