/*package whatever //do not write package name here */

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
		    int k=sc.nextInt();
	
		 int a[] = new int[n];
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 System.out.println(max(a,n,k));
	}
}
	static int max(int a[], int n, int k){
	    int maxsum=0;
	    for(int i=0;i<k;i++)
	       maxsum+=a[i];
	      
	    int wsum=maxsum;   
	    for(int i=k;i<n;i++){
	       wsum+=a[i]-a[i-k];     
	       maxsum = Math.max(maxsum, wsum); 
	    } 
	    return maxsum;
	}
}