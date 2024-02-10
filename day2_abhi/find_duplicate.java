package day2_abhi;

class Solution {
    public int findDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        
        while(start < end){
            int mid = (start + end) / 2;
            
            int count = 0;
            
            for(int x = 0; x < nums.length; x++){
                if(nums[x] <= mid)
                    count++;
            }
            
            if(count <= mid){
                start = mid + 1;
            }
            else
                end = mid;
            
        }
    return start;
    
        }
}