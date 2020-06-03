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
		 int m=sc.nextInt();
		 
		 System.out.println(res(a,m,n));
	}
 }	
	public static int res( int a[], int m,int n){
	    int l=0,r=0,zc=0,bw=0;
		 while(r<n){
		   
		   if(zc<=m){
		       if(a[r]==0)
		         zc++;
		        r++; 
		   }
		   
		   if(zc>m){
		       if(a[l]==0)
		         zc--;
		        l++;
		   }
		   
		   if((r-l)>bw && zc<=m)
		    bw=r-l;
		 }
		 return bw;
	  }
	
}