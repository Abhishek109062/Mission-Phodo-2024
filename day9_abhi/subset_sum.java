package day9_abhi;
import java.util.*;
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        sumCal(ans, 0, arr, N, 0);
        return ans;
    }
    
    void sumCal(ArrayList<Integer> ans, int sum, ArrayList<Integer> arr, int n, int index){
        ans.add(sum);
        
        int x;
        for(x = index; x < n; x++){
            
            sum += arr.get(x);
            sumCal(ans, sum, arr, n, x+1);
            sum -= arr.get(x);
        }
    }
}