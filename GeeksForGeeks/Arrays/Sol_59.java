
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
	
		 int a[][] = new int[n][m],i,j;
		 
		 for(i=0;i<n;i++){
		     for(j=0;j<m;j++){
		         a[i][j]=sc.nextInt();
		 }
		} 
		int min=Integer.MAX_VALUE,res=0,ind=0;
		
		for(i=0;i<n;i++){
		    ind=index(a[i],m);
		    if(ind<min){
		      min=ind;
		      res=i;
		    }    
		}
		
		System.out.println(res);
	  } 
	}
	
	public static int index(int a[],int n){
	    int left=0,right=n-1;
	    while(left<=right){
	        int mid=left+(right-left)/2;
	        if(a[mid]==1 && (mid==0 || a[mid-1]==0))
	          return mid;
	        else if(a[mid]==1 && a[mid-1]==1)
	         right=mid-1;
	        else
	         left=mid+1;
	    }
	    return n+1;
	}
}