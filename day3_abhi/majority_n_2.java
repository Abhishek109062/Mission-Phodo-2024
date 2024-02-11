package day3_abhi;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int temp = nums[0];

        for(int x = 1; x < nums.length; x++){
            if(temp == nums[x]){
                count++;
            }else
            count--;

            if(count < 0){
                temp = nums[x];
                count = 0;
            }
        }


        // count = 0;
        // for(int x = 0; x < nums.length; x++){
        //     if(nums[x] == temp)
        //     count++;
        // }

        return temp;
    }
}