/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 int pos= peakElement(a,n);
		 if(pos==-1)
		 System.out.println(0);
		 else
		  System.out.println(a.length-pos);
		}
	}
	
	public static int peakElement(int[] a,int n)
    {
       
       int left=0,right=n-1,mid;
       while(left<=right){
           mid=left + (right-left)/2;
           if((mid==0 || a[mid-1]==1) && a[mid]==0)
              return mid;
           else if (a[mid]==1)
             left=mid+1;
            else
              right=mid-1; 
       }
        return -1;
       
    }
	
}