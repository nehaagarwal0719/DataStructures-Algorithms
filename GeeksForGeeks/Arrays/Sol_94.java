import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		  
	
		 int a[] = new int[n];
		 int j;long max=0;
		 
		  for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		  }
		  Arrays.sort(a);
		  
		  for(j=0;j<n;j++){
		     
		     max+=a[j]*j;
		  }
		  
		  //System.out.println((int)(max));
		  System.out.println((long)(max%(Math.pow(10,9)+7)));
		}
	 }
}