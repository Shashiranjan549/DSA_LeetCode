class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int GlobalMaxArea=0;
        while(left<right){
            int length=Math.min(height[left],height[right]);
            int width=right - left;
            int currentArea=length*width;
            GlobalMaxArea=Math.max(GlobalMaxArea,currentArea);
            if (height[left] < height[right]){
                left ++;
            }
            else{
                right --;
                
            }
        }
        return GlobalMaxArea;
    }
}