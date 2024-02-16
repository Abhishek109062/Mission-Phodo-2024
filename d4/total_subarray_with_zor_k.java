import java.util.*;
public class Solution {
    public int solve(int[] arr, int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        int xor=0;
            for(int i:arr){
            xor=xor^i;
            if(xor==n)c++;
             if(hm.containsKey(xor^n))
                c+=hm.get(xor^n);
            if(hm.containsKey(xor)){
                hm.put(xor,hm.get(xor)+1);
            }
            else{
                hm.put(xor,1);
            }
           
            
        }
        return c;
    }
}
