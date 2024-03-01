package day9_abhi;
import java.util.*;


class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        traverse(new ArrayList<>(), ans, s);
        return ans;
    }

    public void traverse(List<String> temp, List<List<String>> ans, String s){
        if(s.length() == 0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int x = 1; x <= s.length(); x++){
            String tr = s.substring(0, x);
            if(isPalindrome(tr)){
                temp.add(tr);
                traverse(temp, ans, s.substring(x));
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s){
      int len = s.length()-1;
        for(int x = 0; x < s.length()/2; x++){
            if(s.charAt(x) != s.charAt(len-x))
                return false;
        }
        return true;
    }
}