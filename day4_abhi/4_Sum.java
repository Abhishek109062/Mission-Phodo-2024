
/*idea is to sort the array so that we can eliminate end cases like if target is greater than or less than the sum and we also help us to avoid the duplicates , Then it quite easy using 3 loops  */
package day4_abhi;
import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || n < 4) {
            return ans;
        }
        
        for(int i = 0; i < n-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) {
                break;
            }
            
            if ((long) nums[i] + nums[n-3] + nums[n-2] + nums[n-1] < target) {
                continue;
            }

            for(int j = i+1; j < n-2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                if ((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) {
                    break;
                }
            
                if ((long) nums[i] + nums[j] + nums[n-2] + nums[n-1] < target) {
                    continue;
                }
                int l = j+1;
                int r = n-1;
                while(l < r) {
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while(l < r && nums[l] == nums[l+1]) {
                            l++;
                        }
                        l++;
                        while(l < r && nums[r] == nums[r-1]) {
                            r--;
                        }
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }

            }
        }
        return ans;
    }
    
}