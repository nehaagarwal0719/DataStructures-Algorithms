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
		 int sum=sc.nextInt();
		 
		 int l=0,r=n-1,f=0;
		 while(l<r){
		     if(a[l]+a[r]==sum){
		         System.out.println(a[l]+" "+a[r]+" "+sum);
		         l++;
		         r--;
		         f=1;
		     }
		      else if(a[l]+a[r]<sum)
		        l++;
		      else
		        r--;
		 }
		 if(f==0)
		  System.out.println(-1);
		}
	}
}