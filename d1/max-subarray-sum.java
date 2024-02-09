class Solution {
    public int maxSubArray(int[] nums) {
        //kadanes
        //****special case include also when all elements are negative */
        int max_sum=0;
        int curr_sum=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            curr_sum+=nums[i];
            if(curr_sum>max_sum)
                max_sum=curr_sum;
            if(curr_sum<0)
                curr_sum=0;
            mx=Math.max(mx,nums[i]);
        }
        return mx>0?max_sum:mx;
    }
}
