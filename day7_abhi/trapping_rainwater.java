package day7_abhi;



class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, rightmax = Integer.MIN_VALUE, leftmax = Integer.MIN_VALUE, ans = 0;

        while(left <= right){
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);


            if(leftmax < rightmax){
                ans += (leftmax - height[left++]);
            }else{
                ans += (rightmax - height[right--]);
            }
        }
    return ans;
    }
}