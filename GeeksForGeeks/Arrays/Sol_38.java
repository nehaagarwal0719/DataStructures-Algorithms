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
		 int flag=0;
		 for(int i=0;i<n-1;i++){
		     if(arr[i+1]-arr[i]>1){
		        flag=1;
		        break;
		     } 
		 }
		 if(flag==0)
		  System.out.println("Yes");
		 else
		  System.out.println("No");
	  } 
	}
}

//better sol
// Storing elements of 'arr[]' in  
        // a hash table 'us' 
        HashSet<Integer> us = new HashSet<Integer>(); 
          
        for (int i = 0; i < n; i++) 
            us.add(arr[i]); 
  
        // As arr[0] is present in 'us' 
        int count = 1; 
  
        // Starting with previous smaller  
        // element of arr[0] 
        int curr_ele = arr[0] - 1; 
  
        // If 'curr_ele' is present in 'us' 
        while (us.contains(curr_ele) == true) { 
  
            // increment count 
            count++; 
  
            // update 'curr_ele" 
            curr_ele--; 
        } 
  
        // Starting with next greater  
        // element of arr[0] 
        curr_ele = arr[0] + 1; 
  
        // If 'curr_ele' is present in 'us' 
        while (us.contains(curr_ele) == true) { 
  
            // increment count 
            count++; 
  
            // update 'curr_ele" 
            curr_ele++; 
        } 
  
        // Returns true if array contains a set of 
        // contiguous integers else returns false 
        return (count == (us.size())); 