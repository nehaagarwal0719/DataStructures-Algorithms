import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
		 
	        
		 int arr[] = new int[n],j,i,s=0;
		     
		 for(j=0;j<n;j++)
		     arr[j]=sc.nextInt();  
		     
        int incl = arr[0]; 
        int excl = 0; 
        int excl_new; 

        for (i = 1; i < n; i++) 
        { 
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl; 
  
            /* current max including i */
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
  
        System.out.println((incl > excl) ? incl : excl); 
		 
		}
	}
}