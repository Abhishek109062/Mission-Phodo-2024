//can either use map or hashSet to keep the track of the duplicate
package day4_abhi;
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        // int curr = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int x = 0; x < s.length(); x++){
            char ch = s.charAt(x);
            // curr++;
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.get(ch) > 1){
                char temp = s.charAt(start);
                map.put(temp, map.get(temp) - 1);
                start++;
            }
            ans = Math.max(ans, x - start + 1);
        }

        return ans;
    }
}