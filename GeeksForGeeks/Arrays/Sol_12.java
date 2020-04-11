import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 int a[] = new int[n];
		 
		 for(j=0;j<n;j++)
		     a[j]=sc.nextInt();
		 
		 int s=0;
		 
		 for(j=1;j<n-1;j++){
		     if(a[j-1] > a[j] && a[j+1] > a[j])
		        s=s+Math.abs(a[j-1]-a[j+1]);
		 }
		     
		 System.out.println(s);    
		}	 
	}
}