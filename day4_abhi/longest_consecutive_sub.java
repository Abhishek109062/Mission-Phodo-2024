package day4_abhi;

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        int ans = 0;

        for(int x : nums)
        temp.add(x);

        for(int x : nums){
            if(!temp.contains(x-1)){
                int tr = x;
                int count = 1;

                while(temp.contains(x+1)){
                    count++;
                    x++;
                }
                ans = ans > count ? ans: count;
            }
        }

        return ans;
    }
}