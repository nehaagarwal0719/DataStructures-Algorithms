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
	        //int k=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 int res=0;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     res=res^a[j];
		 }
		  System.out.println(res);
		} 
	}
}