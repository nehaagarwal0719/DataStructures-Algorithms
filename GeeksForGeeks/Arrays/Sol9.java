class GfG {
    int transitionPoint(int a[], int n) {
     
    int left=0,right=n-1;
   
    
    while(left<=right){
     int mid=(left+right)/2;
     
        if(a[mid]==1 && (mid==0 || a[mid-1]==0))
          return mid;
        else if(a[mid]==1 && a[mid-1]==1)
           right=mid-1;
       else 
            left=mid+1;
        }
   return -1;
    }
}