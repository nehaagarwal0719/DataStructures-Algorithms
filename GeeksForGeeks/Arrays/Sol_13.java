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
		    
		 int a[] = new int[n];
		 int j,c=0;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		  } 
		 
		  for(j=0;j<n;j++){
		    if(a[j]==0)
		       c++;
		     else
		       System.out.print(a[j]+" ");
		  }
		  
		 for(j=0;j<c;j++)
		      System.out.print(0+ " ");
		       
		 System.out.println();     
		      
		 
	  }	 
	}
}