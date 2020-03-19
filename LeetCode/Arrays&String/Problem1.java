class Solution {
    public int dominantIndex(int[] nums) {
        int i,l= nums[0],pos=0,f=0;
        for (i=1;i< nums.length;i++){
             if (nums[i]>l){
                 l=nums[i];
                 pos=i;
                }
        }    
       for(i=0;i<nums.length;i++){
            if(l<2*nums[i] && i!=pos){
                return -1;
            }
        }
    return pos;
    }
}
