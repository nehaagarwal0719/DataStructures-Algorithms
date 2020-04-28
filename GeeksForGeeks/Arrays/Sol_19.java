/*package whatever //do not write package name here */

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
		    int k=sc.nextInt();
	
		 int a[] = new int[n];
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
	     rot(a,k);
	     
		 for (j= 0; j < n; j++) 
            System.out.print(a[j] + " "); 
        
         System.out.println(); 
		 
	}
 }	
 
    public static void rot(int a[], int k){
          for(int j=0;j<k;j++)
		   rotbyone(a,a.length);
         
     }
 
     public static void rotbyone(int a[], int n){
         int temp=a[0];
         for(int i=0;i<n-1;i++){
             a[i]=a[i+1];
         }
         a[n-1]=temp;
         
     }
}