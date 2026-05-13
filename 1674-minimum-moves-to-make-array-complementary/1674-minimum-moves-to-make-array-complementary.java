class Solution {
    public int minMoves(int[] nums, int limit) {
        int n=nums.length;
        int[] data=new int[(limit<<1)+2];

        for (int i=0;i<n>>1;i++){

            int a=nums[i];
            int b=nums[n-1-i];
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            data[2] += 2;
            data[2 * limit + 1] -= 2;
            
            data[min+1] -=1;
            data[max+limit+1] +=1;
            data[a + b] -= 1;
            data[a + b + 1] += 1;
        }

        int res=n,moves=0;
        for (int targ=2;targ<=limit*2;targ++){
            moves +=data[targ];
            res=Math.min(res,moves);
        }
        return res;
        
    }
}