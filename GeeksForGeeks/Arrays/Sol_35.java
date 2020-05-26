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
		  int s=a[0];
		  
		  for(j=1;j<n;j++){
		      if(a[j]<s)
		        s=a[j];
		  }     
		  
		  System.out.println(s*(n-1));
		} 
	}
}