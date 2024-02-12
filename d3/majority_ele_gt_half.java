class Solution {
    public int majorityElement(int[] nums) {
        int majEle=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++)
        {
            if(majEle!=nums[i])
            {
                vote--;
            }
            else{
                vote++;
            }
            if(vote==0)
            {
                majEle=nums[i];
                vote++;
            }
        }
        return majEle;
    }
}
