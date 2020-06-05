// I think better but TLE EXCCES

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
		 
		 for(j=0;j<n;){
		     if(a[j]>=0 && a[j]!=-1){
		         int temp=a[j];
		         a[j]=a[a[j]];
		         a[a[j]]=temp;
		     }
		     else
		     j++;
		 }
		for(j=0;j<n;j++)
		 System.out.print(a[j]);
		 System.out.println();
		 
	  } 
	}
}

//SOLUTION WITHIN TIME LIMIT

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
		 HashSet<Integer> hs = new HashSet<Integer>();
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     hs.add(a[j]);
		 }
		 
		 for(j=0;j<n;j++){
		     if(hs.contains(j))
		       System.out.print(j+ " ");
		      else
		        System.out.print(-1+" ");
		 }

		 System.out.println();
		 
	  } 
	}
}