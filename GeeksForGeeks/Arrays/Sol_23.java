class GfG {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int left=0,right=n-1,mid,index=n;
        
        while(left<=right){
            mid= left + (right -left)/2;
            
            if(a[mid]==b[mid]){
                left=mid+1;
            }
            
            else{
                index=mid;
                right=mid-1;
            }
            
        }
      return index;  
    }
}