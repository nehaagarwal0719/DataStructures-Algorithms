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
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 StringBuffer sb = new StringBuffer();
		 
		 for(int j=0;j<n-1;j++){
		     if(a[j+1]<a[j])
		       sb.append(a[j+1]+" ");
		     else
		       sb.append(-1 +" ");
		 }   
		       sb.append(-1);
		       System.out.println(sb);
		} 
	}
}