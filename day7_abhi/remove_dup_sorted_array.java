package day7_abhi;

class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0)
       return -0;
       int ind = 1;
        int count = 1;
       for(int x = 1; x < nums.length; x++){
           if(nums[x] == nums[x-1])
           continue;
           else{
               nums[ind++] = nums[x];
               count++;
           }
       }

       return count;
    }
}s