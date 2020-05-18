import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     a[j]=a[j]-j;
		 } 
		 
		 int m,max=0;
		 
		 int l=a[0],s=a[0];
		 
		 for(j=1;j<n;j++){
		    if(a[j]>l)
		      l=a[j];
		    if(a[j]<s)
		      s=a[j];
		 } 
		 
		 System.out.println(l-s);
		 
		}	 
		 
	}
}