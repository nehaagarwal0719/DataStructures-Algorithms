class Solution {
       public int[] plusOne(int[] digits) {
           for(int i = digits.length -1; i >= 0; i--){
		   //first check if final digit is less than 9--> digit can be incremented and array returned
               if(digits[i] != 9){
                   digits[i]++;
                   return digits;
               }else {
			   //if last digit is 9--> carryover to prev element in the array and ++ that element
                   digits[i] = 0;
               }
           }
		   
           if(digits[0] == 0){
               int[] results = new int[digits.length +1];
               results[0] = 1;
               return results;
           }
           return digits;
       }
}
