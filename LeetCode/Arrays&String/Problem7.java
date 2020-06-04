//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

class Solution {
    public int searchInsert(int[] a, int target) {
        int l=0,r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==target)
                return mid;
            else if(a[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}