package day10_abhi;
import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        combi(nums, nums.length, 0, ans);
        return ans;
    }


    public void combi(int[] nums, int len, int index, List<List<Integer>> ans){
        if(index == len){
            List<Integer> temp = new ArrayList<>();

            for(int x : nums)
            temp.add(x);

            ans.add(temp);
            return;
        }

        for(int x = index; x < nums.length; x++){
            swap(nums, x, index);
            combi(nums, len, index+1, ans);
            swap(nums, x, index);
        }

    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}