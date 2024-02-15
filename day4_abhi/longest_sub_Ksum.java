package day4_abhi;

import java.util.HashMap;
import java.util.Map;

public class longest_sub_Ksum
{
    int maxLen(int arr[], int n)
    {
       int ans = 0;
       int sum = 0;
       Map<Integer, Integer> temp = new HashMap<>();
       for(int x = 0; x < arr.length; x++){
           sum += arr[x];
           if(sum == 0)
           ans = x+1;
           else{
               
           if(temp.getOrDefault(sum, -1) != -1){
               ans = Math.max(ans, x - temp.get(sum));
           }else
           temp.put(sum, x);
           
           }
       }
       
       return ans;
    }

}
