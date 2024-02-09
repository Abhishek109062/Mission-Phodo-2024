package Day1_abhi;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int running_max = 0;
        
        
        for(int x = 0; x < nums.length; x++){
            running_max += nums[x];
            
            if(running_max > max)
                max = running_max;
            
            if(running_max < 0)
                running_max = 0;
        }
        return max;
    }
}
