class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(l<r){
            int wd=r-l;
            int ht=Math.min(height[l],height[r]);
            int area=wd*ht;
            if(area>maxArea){
                maxArea=area;

            }
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxArea;
    }
}