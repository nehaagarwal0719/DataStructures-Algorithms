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
	
		 int a[] = new int[n],j,max=Integer.MIN_VALUE;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(a[j]>max)
		      max=a[j];
		 } 
		 
		 HashSet<Integer> hs = new HashSet<Integer>();
		 int a1=0,b=1,c=0;
		 hs.add(a1);
		 while(c<=max){
		     c=a1+b;
		     hs.add(c);
		     a1=b;
		     b=c;
		 }
		  String res="";
		  for(j=0;j<n;j++){
		      if(hs.contains(a[j]))
		        res+=a[j]+" ";
		  }    
		 System.out.println(res);
	  }	 
	}
}