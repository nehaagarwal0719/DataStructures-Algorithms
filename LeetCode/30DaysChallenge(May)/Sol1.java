public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       
        int left=0,right=n-1,mid=0;
        
        while(left<=right){
            mid=left+(right-left)/2;
            if(isBadVersion(mid) && (!isBadVersion(mid-1)|| mid==0))
                return mid;
            else if( isBadVersion(mid-1))
                right=mid-1;
            else
                left=mid+1;
        }
        return n;
    }
}