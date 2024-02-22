package day9_abhi;
import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        cal(ans, new ArrayList<>(),candidates, target, 0, candidates.length);
        return ans;
    }


    public void cal(List<List<Integer>> ans ,List<Integer> temp, int[] candid, int target, int index, int len){
        if(target == 0)
       {
            ans.add(new ArrayList<>(temp));
            return;
       }

        if(0 > target)
        return;

        for(int x = index; x < len; x++){
            temp.add(candid[x]);
            target -= candid[x];
            cal(ans, temp, candid, target, x, len);
            temp.remove(temp.size() - 1);
            target += candid[x];
        }
    }
}