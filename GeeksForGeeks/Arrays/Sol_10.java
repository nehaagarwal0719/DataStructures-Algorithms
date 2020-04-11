import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 int a[] = new int[n];
		 int sl=0,sr=0;
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(j<n/2)
		       sl=sl+a[j];
		     else
		       sr=sr+a[j];
		 } 
		 
		 System.out.println(Math.abs(sl-sr));
		 
		}
	}
}