class GfG {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int left=0,right=n-2,mid,index=n-1;
        
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