import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	    InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    
		int T=Integer.parseInt(br.readLine());
		
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=Integer.parseInt(br.readLine());
		    
		 int arr[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     arr[j]=Integer.parseInt(strs[j]);
		 }
		 
	    check(arr,n);
	}
	}
	public static void check(int arr[],int n){
	    	 int min = -1,flag=0; 

        HashSet<Integer> set = new HashSet<>(); 
  
        for (int j=n-1; j>=0; j--) 
        { 
            // If element is already in hash set, update min 
            if (set.contains(arr[j])) {
                min = j; 
                flag=1;
            }
  
            else   // Else add element to hash set 
                set.add(arr[j]); 
        } 
  
        // Print the result 
        if (flag== 0) 
          System.out.println(min); 
        else
          System.out.println(min+1);
		 
    } 
	}
