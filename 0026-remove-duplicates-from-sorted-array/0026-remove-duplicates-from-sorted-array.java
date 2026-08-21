class Solution {
    public int removeDuplicates(int[] nums) {

        int n=nums.length;
        int k=1;
        for(int j=1;j<n;j++){
            if (nums[j] !=nums[j-1]){
                nums[k]=nums[j];
                k=k+1;
            }
        }
        return k;
    }
}