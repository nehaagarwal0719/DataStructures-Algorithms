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
		    int x = sc.nextInt();
	
		 int a[] = new int[n];
		 int j,m=Integer.MAX_VALUE;
		 
		  for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		  } 
		  int subsum=0,c=0;
		   for(j=0;j<n;j++){
		        subsum=0;c=0;
		     for(int k=j;k<n;k++){
		       subsum +=a[k];
		       c++;
		       if(x<subsum && m>c){
		          m=c;
		       }
		    }
		  }
		 
		 System.out.println(m);
		} 
	}
}