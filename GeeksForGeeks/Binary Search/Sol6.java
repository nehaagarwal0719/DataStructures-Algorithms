class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0, r=letters.length-1;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(letters[mid]<=target)
                 l=mid+1;
            else {
                 r=mid-1;
                  res=mid;
            }
        }
        return letters[res];
    }
}