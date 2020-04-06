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
		    
		 int a[] = new int[n];
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 
		 int min=Integer.MAX_VALUE;
		 int max= Integer.MIN_VALUE;
		 
		 for(int j=0;j<n;j++){
		     
		     if(a[j]<min)
		       min=a[j];
		     if(a[j]>max)
		       max=a[j];
		 }
		 
		 System.out.println(min+" "+max);
		}	 
	}
}