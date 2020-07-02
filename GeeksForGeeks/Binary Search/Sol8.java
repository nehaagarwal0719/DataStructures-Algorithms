import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        int val=sc.nextInt();
		    int a[] = new int[n],j;
		 
	   	 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 System.out.println(pivotedBinarySearch(a,n,val));
		 
		 
	  } 
	}	  
static int findPivot(int arr[], int n) 
    { 
      int l=0,r=n-1;
       while(l<=r){
       int mid = (l + r)/2;    
       if (mid < r && arr[mid] > arr[mid + 1]) 
           return mid; 
       if (mid > l && arr[mid] < arr[mid - 1]) 
           return (mid-1); 
       if (arr[l] >= arr[mid]) 
           r=mid-1;
       else       
           l= mid + 1; 
    } 
    return -1;
 }

 
 static int binarySearch(int arr[], int low, int high, int key) 
    { 
       if (high < low) 
           return -1; 
         
      
       int mid = (low + high)/2;   
       if (key == arr[mid]) 
           return mid; 
       if (key > arr[mid]) 
           return binarySearch(arr, (mid + 1), high, key); 
       return binarySearch(arr, low, (mid -1), key); 
    } 
  static int pivotedBinarySearch(int arr[], int n, int key) 
    { 
       int pivot = findPivot(arr,n); 
        
       if (pivot == -1) 
           return binarySearch(arr, 0, n-1, key); 
        

       if (arr[pivot] == key) 
           return pivot; 
      if (arr[0] <= key) 
           return binarySearch(arr, 0, pivot-1, key); 
      return binarySearch(arr, pivot+1, n-1, key); 
      // return pivot;
    }    
    
}