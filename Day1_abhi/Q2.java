package Day1_abhi;

import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        
        temp.add(1);
      ans.add(new ArrayList<>(temp));
        if(numRows == 1)
            return ans;
        
        
        for(int x= 2; x <= numRows; x++){
            List<Integer> temp2 = new ArrayList<>();
            
            temp2.add(1);
            
            for(int y = 0; y < temp.size() - 1; y++){
                temp2.add(temp.get(y) + temp.get(y+1));
            }
            
            temp2.add(1);
            
            ans.add(new ArrayList<>(temp2));
            temp = temp2;
        }
        
        
        return ans;
    }
}