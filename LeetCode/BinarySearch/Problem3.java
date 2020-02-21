public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=0,right=n,mid;
        while(left<=right){
            mid=left+(right-left)/2;
            int res=guess(mid);
            if(res==0)
                return mid;
            else if(res<0)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}

