package day3_abhi;
import java.util.*;

//since we r finding n/3 times , there can only be 2 numbers at max , thererfore we will use 4 variables to maintain the max elements and their count.


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int temp1 = Integer.MIN_VALUE;
        int temp2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for(int x = 0; x < nums.length; x++){
            if(count1 <= 0 && temp2 !=  nums[x]){
                temp1 = nums[x];
                count1 = 1;
            }
            else if(count2 <= 0 && temp1 != nums[x]){
                temp2 = nums[x];
                count2 =1;
            }
            else if(temp1 == nums[x])
            count1++;
            else if(temp2 == nums[x])
            count2++;
            
            else{
                count1--;
                count2--;
            }
            
        }
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int x = 0; x < len; x++){
            if(temp1 == nums[x])
            count1++;
            if(temp2 == nums[x])
            count2++;
        }
        if(count1 > len/3)
        ans.add(temp1);



         if(count2 > len/3)
        ans.add(temp2);

        return ans;
    }
}