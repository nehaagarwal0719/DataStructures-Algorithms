class Solution {
    public void moveZeroes(int[] nums) {
        
     int last=0;   
     for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) 
            nums[last++] = nums[i];
        
    }
 
    for (int i = last; i < nums.length; i++) {
        nums[i] = 0;
    }
        
    }
}