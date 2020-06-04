import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        
	        
		 int a[] = new int[n],j;
		 int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(a[j]>max)
		      max=a[j];
		     if(a[j]<min)
		      min=a[j];
		 }
		 
		  if(areConsecutive(a,n,min,max))
		   System.out.println("Yes");
		  else
		     System.out.println("No");
		 
	  } 
	}
	public static boolean areConsecutive(int arr[], int n, int min , int max)  
    { 
        if (n < 1) 
            return false; 
  
     
        /* 3) max-min+1 is equal to n then only check all elements */
        if (max - min + 1 == n)  
        { 
            int i; 
            for (i = 0; i < n; i++)  
            { 
                int j; 
  
                if (arr[i] < 0) 
                    j = -arr[i] - min; 
                else
                    j = arr[i] - min; 
  
                // if the value at index j is negative then 
                // there is repitition 
                if (arr[j] > 0)  
                    arr[j] = -arr[j]; 
                else
                    return false; 
            } 
  
            /* If we do not see a negative value then all elements 
               are distinct */
            return true; 
        } 
  
        return false; // if (max-min+1 != n) 
    } 
}

////IF ONLY +VE NOSFind the sum of the array.
If given array elements are consecutive that means they are in AP. So, find min element i.e. first term of AP then calculate ap_sum = n/2 * [2a +(n-1)*d] where d = 1. So, ap_sum = n/2 * [2a +(n-1)]
Compare both sums. Print Yes if equal, else No.