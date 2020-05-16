import java.util.*; 
class Solution {
    public int maxSubArray(int[] nums) {
       return maxsum(nums,0,nums.length-1);
    }
    
    public int maxsum(int[] nums, int l, int r){
        
        if(l==r)
            return nums[l];
        
        int m=(l+r)/2;
        
        return Math.max(Math.max(maxsum(nums, l, m), 
                    maxsum(nums, m+1, r)), 
                    maxCrossingSum(nums, l, m, r)); 
    }
    
    public int maxCrossingSum(int[] nums, int l, int m, int r){
        
        int sum = 0; 
        int left_sum = Integer.MIN_VALUE; 
        for (int i = m; i >= l; i--) 
        { 
            sum = sum + nums[i]; 
            if (sum > left_sum) 
            left_sum = sum; 
        } 
  
        sum = 0; 
        int right_sum = Integer.MIN_VALUE; 
        for (int i = m + 1; i <= r; i++) 
        { 
            sum = sum + nums[i]; 
            if (sum > right_sum) 
            right_sum = sum; 
        } 
  
        return left_sum + right_sum; 
    }
}