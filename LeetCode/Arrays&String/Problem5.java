/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length;

        while(left<right){
            if(nums[left]==val){
                nums[left]=nums[right-1];
                right--;
            }  
            else
                left++;
        }
        return right;
    }
}
