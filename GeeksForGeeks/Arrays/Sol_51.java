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
	
	
		 int a[] = new int[n],f=0;
		   
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 
		 for(int j=0;j<n;j++){
		     int val=Math.abs(a[j]);
		     if(a[val-1]>0)
		       a[val-1]=-a[val-1];
		     else
		      System.out.print(val+ " ");
		 }
		 
		 for(int j=0;j<n;j++){
		     if(a[j]>0)
		      System.out.print(j+1);
		 }
     System.out.println();
	}
	}
}