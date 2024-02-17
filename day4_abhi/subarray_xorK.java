import java.util.*;
public class Solution {
    public int solve(int[] A, int b) {
        int pre = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(pre, 1);
        for(int x = 0; x < A.length; x++){
            pre = pre ^ A[x];
            
            
            int temp = pre^b;
            if(map.containsKey(temp))
                ans += map.get(temp);
            
            int temp2 = map.getOrDefault(pre, 0) + 1;
            map.put(pre, temp2);
        }
        
        return ans;
    }
}
