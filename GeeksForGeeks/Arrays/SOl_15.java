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
		    
		 int f=0;
		 int a[] = new int[n];
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
         Arrays.sort(a);    
		 for(int j=0;j<n-2;j++){
		         System.out.print(a[j]+" ");
		 }
		   
		 System.out.println();
		 
	}
}
}

//can do this which is o(nlogn) or calculate second largest element and print all elements less than it o(n)