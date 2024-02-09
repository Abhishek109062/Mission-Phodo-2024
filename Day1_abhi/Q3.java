package Day1_abhi;


class Solution {
    public void nextPermutation(int[] nums) {
       int temp = nums.length - 2;
        
        while(temp >= 0 && nums[temp] >= nums[temp+1])
            temp--;
        
        int temp2 = nums.length - 1;
        
        if(temp >= 0){
            while(temp2 >= temp && nums[temp] >= nums[temp2])
                temp2--;
            
            swap(nums, temp, temp2);
        }
        
        reverse(nums, temp+1, nums.length-1);
    }
    
    public void reverse(int[] nums,int start, int end){
        while(start < end){
           swap(nums, start, end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}