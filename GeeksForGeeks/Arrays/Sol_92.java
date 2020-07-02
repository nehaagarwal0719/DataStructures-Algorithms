class Solution 
{ 
	static int[] SortBinaryArray(int a[], int n) 
	{ 
	    int l=0,r=n-1;
	    while(l<=r){
	        if(a[l]==0)
	         l++;
	        else if(a[r]==1)
	         r--;
	        else{
	            int temp=a[l];
	            a[l]=a[r];
	            a[r]=temp;
	        } 
	    }
	    return a;
	} 
} 