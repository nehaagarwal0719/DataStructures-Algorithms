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
		 int count=0;
		 
		 for (int i=0; i<n; i++) 
         { 
            int product = arr[i]; 
            int sum = arr[i]; 
            for (j=i+1; j<n; j++) 
            { 
                // checking if product is equal 
                // to sum or not 
                if (product==sum) 
                    count++; 
       
                product *= arr[j]; 
                sum += arr[j]; 
            } 
       
            if (product==sum) 
                count++; 
        } 
        
        System.out.println(count);
	}    
	}
}