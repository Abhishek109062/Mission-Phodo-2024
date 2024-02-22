package day9_abhi;
import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(ans, new ArrayList<>(), 0, nums, nums.length);
        return ans;
    }

    public void subset(  List<List<Integer>> ans,List<Integer> temp, int index, int[] nums, int len){
            ans.add(new ArrayList<>(temp));
        int x;
        for( x = index; x < len; x++){
            if(x != index && nums[x] == nums[x-1])
            continue;

            temp.add(nums[x]);
            subset(ans, temp, x+1, nums, len);
            temp.remove(temp.size() - 1);
        }
    }
}