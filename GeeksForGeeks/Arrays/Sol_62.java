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
		 }
		 
		  for(j=1;j<n;j=j+2){
		      int temp=a[j];
		      a[j]=a[j-1];
		      a[j-1]=temp;
		  }    
		 
		  for(j=0;j<n;j++){
		      System.out.print(a[j]+" ");
		  }     
		  
		  System.out.println();
	  }	 
	}
}