class Solution {
    public int searchInsert(int[] nums, int target) {
        int Left=0;
        int Right=nums.length-1;
        int storeIndex = -1;
        while(Left <= Right){
            int Mid=Left+(Right-Left)/2;
            if(nums[Mid] >= target){
                storeIndex = Mid;
                Right = Mid -1;
            }else{
                Left = Mid +1;
            }
            

        }
        return storeIndex != -1 ? storeIndex : nums.length;
    }
}