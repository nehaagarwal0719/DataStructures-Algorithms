import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
		    fib(n);
		    System.out.println();
		}
	}
	
	public static void fib(int n){
	    long lk[]=new long[n+1];
	    lk[0]=1; 
	    lk[1]=1;
	    
	    for(int i=2;i<n;i++)
	      lk[i]=lk[i-1]+lk[i-2];
	    
	    for(int j=0;j<n;j++)  
	      System.out.print(lk[j]+" ");
	     
	}
}