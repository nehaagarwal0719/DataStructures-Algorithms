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
	
		 int arr[] = new int[n],j;
		 
		 for(int m=0;m<n;m++){
		     arr[m]=sc.nextInt();
		 } 
		 
		 Arrays.sort(arr);
		 int res=0,max=0;
		 
		 
		 for(int i=0;i<n-1;i++){
		     res=arr[i+1]-arr[i];
		     if(res>max)
		       max=res;
		 }
		  System.out.println(max);
		}
	}
}