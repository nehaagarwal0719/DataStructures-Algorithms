
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		
		 Scanner sc = new Scanner(System.in);
	    
		 int T=sc.nextInt();
		
		 for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    int a[] = new int[n],j,c=0;
		 
	   	 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(a[j]==1)
		      c++;
		 } 
		 
		 //System.out.println(c);
		 
		 int c1=0,max=0;
		 int x=c;
		 
		 for(j=0;j<x;j++){
		     if(a[j]==1)
		       c1++;
		 }
		 max=c1;
		 
		 for(j=x;j<n;j++){
		     if(a[j]==1)
		       c1++;
		     if(a[j-x]==1)
		       c1--;
		     if(c1>max)
		      max=c1;
		 }
		  if(c==0)
		   System.out.println(-1);
		  else 
		  System.out.println(c-max);
		 
		} 
	}
}