package day2_abhi;
import java.util.*;

//by traversing it from end we dont have to take care about swaping the data at the sorted position.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m-1, y = n-1, z = m+n - 1;
        
        while(z >= 0){
            if(y < 0 || (x >= 0 && nums1[x] > nums2[y]))
                nums1[z--] = nums1[x--];
            else
                nums1[z--] = nums2[y--];
        }                    
    }
}