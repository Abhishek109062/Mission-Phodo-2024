package day2_abhi;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] temp = new int[A.length + 1];
       
        int[] ans = new int[2];
        
        for(int x = 0; x < A.length; x++){
            if(temp[A[x]] != 0)
            {
                ans[0] = A[x];
                
            }
            temp[A[x]] = 1;
        }
        
        for(int x = 1; x < temp.length; x++){
            if(temp[x] == 0){
                ans[1] =  x;
                break;
            }
        }
        return ans;
    }
}
