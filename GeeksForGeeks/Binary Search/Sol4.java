class Solution {
    public int search(int[] a, int target) {
        int l=0,r=a.length-1,n=a.length;
        int res=0;
        if(n==0)
            return -1;
        while(l<=r){
		          //System.out.println(l+" "+r+" "+mid); 
		         int mid = l+ (r - l)/2;  
                if (mid < r && a[mid+1] < a[mid]) {
                    res=mid + 1; 
                    break;
                }
                else if (mid > l && a[mid] < a[mid - 1]) 
                {
                 res=mid; 
                 break;
                }
                else if (a[r] > a[mid]) 
                    r=mid - 1; 
                 else 
                    l=mid+1;
		      }
        if(target==a[res])
            return res;
        else if(target<=a[n-1])
           return solve(a,target,res+1,n-1);
       else  
           return solve(a,target,0,res-1);
        //return res;
    }
    
    public int solve(int[] a, int key, int l, int r){
    
        while(l<=r){
		      int mid=l+(r-l)/2;
		      if(a[mid]==key){
		          return mid;
		      }
		      else if(a[mid]<key)
		       l=mid+1;
		      else
		       r=mid-1;
		  }
        return -1;
    }
}