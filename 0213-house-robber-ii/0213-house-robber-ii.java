class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: Rob houses 0 to n-2 (exclude last house)
        int max1 = robLinear(nums, 0, n - 2);
        // Case 2: Rob houses 1 to n-1 (exclude first house)
        int max2 = robLinear(nums, 1, n - 1);

        return Math.max(max1, max2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int n = end - start + 1;
        if (n == 1) return nums[start];
        
        int[] tracker = new int[n];
        tracker[0] = nums[start];
        tracker[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {
            // Your logic: current house + two houses back OR skip current house
            tracker[i] = Math.max(nums[start + i] + tracker[i - 2], tracker[i - 1]);
        }

        return tracker[n - 1];
    }
}