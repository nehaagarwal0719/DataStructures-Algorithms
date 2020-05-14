class Peak
{

	public int peakElement(int[] a,int n)
    {
       
       int left=0,right=n-1,mid;
       while(left<=right){
           mid=left + (right-left)/2;
           if((mid==0 || a[mid]>=a[mid-1])  && (  mid==n-1 || a[mid]>=a[mid+1]))
              return mid;
           else if(mid>0 && a[mid]<a[mid-1] )
              right=mid-1;
            else
              left=mid+1;
       }
        return 0;
       
    }
}