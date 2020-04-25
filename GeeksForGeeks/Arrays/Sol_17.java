
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
		    int s=sc.nextInt();
		 
		 HashMap<Integer,Integer> hs = new HashMap<>();
		 
		 int a[] = new int[n];
		 int c=0;
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(hs.containsKey(a[j]))
		       hs.put(a[j],hs.get(a[j])+1);
		     else
		       hs.put(a[j],1);
		 } 
		 
		 for(int j=0;j<n;j++){
		      if(hs.containsKey(s-a[j]))
		         c=c+hs.get(s-a[j]);
		        
		     if(s-a[j]==a[j])
		        c--;
		         
		 }   
		 
		 System.out.println(c/2);
		}
	}
}