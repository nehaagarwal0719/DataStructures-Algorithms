/*Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2.*/

class Solution {
   public int[] twoSum(int[] numbers, int target) {
            int l = 0, r = numbers.length - 1;
            while (numbers[l] + numbers[r] != target) {
                if (numbers[l] + numbers[r] > target) r--;
                else l++;
            }
            return new int[]{l + 1, r + 1};
   }    
}
