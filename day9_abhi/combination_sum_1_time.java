package day9_abhi;
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    
    public void find(int[] cand, int target, List<List<Integer>> ans, List<Integer> temp, int ind){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        if(target < 0)
            return;
        
        
        for(int x = ind; x < cand.length; x++){
            if(x != ind && cand[x-1] == cand[x])
                continue;
            
            temp.add(cand[x]);
            find(cand, target - cand[x], ans, temp, x+1);
            temp.remove(temp.size() - 1);
        }
    }
}
