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
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 res(a,n);
	  } 
	}
	
	public static void res(int a[],int n){
	    
	    int max=a[n-1];
	    a[n-1]=-1;
	    
	    for(int i=n-2;i>=0;i--){
	        int temp=a[i];
	        
	        a[i]=max;
	        
	        if(max<temp)
	          max=temp;
	    }
	    
	    for(int i=0;i<=n-1;i++){
	        System.out.print(a[i]+" ");
	    }
	    
	    System.out.println();
	}
}