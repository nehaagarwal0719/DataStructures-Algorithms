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
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 if(a[n-1]==0)
		   System.out.println(-1);
		 else{
		     int left=0,right=n-1,mid;
		     while(left<=right){
		         mid=left+(right-left)/2;
		         if(a[mid]==1 && (mid==0 || a[mid-1]==0 )){
		             System.out.println(mid);
		             break;
		         }
		         else if(a[mid]==1 && a[mid-1]==1)
		              right=mid;
		         else
		              left=mid+1;
		           
		     }
		 }  
	  } 
	}
}