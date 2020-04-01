class Solution {
    public int singleNumber(int[] nums) {
        
        int i;
        Arrays.sort(nums);
        for( i=0;i<nums.length-1;i=i+2){
            if(nums[i]!=nums[i+1]){
                break;
            }      
        }
        
        return nums[i];
    }
}