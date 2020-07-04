import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	     InputStreamReader r1=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r1);    
    
		int T=Integer.parseInt(br.readLine());
		
		int j;
	
         
		for(int h=1;h<=T;h++){
		  
		     int n=Integer.parseInt(br.readLine());
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
         
          int[] leftMax = new int[n]; 
              leftMax[0] = Integer.MIN_VALUE; 
  
    
              for (int i = 1; i < n; i++) 
                   leftMax[i] = Math.max(leftMax[i - 1], a[i - 1]); 


              int rightMin = a[n-1]; 
  
             int f=-1;
              for (int i = n - 2; i >= 1; i--)  
              { 
                   // Check if we found a required element 
                   if (leftMax[i] <= a[i] && rightMin >= a[i]) {
                       f=a[i];
                      
                   }
  
                   // Update right minimum 
                   rightMin = Math.min(rightMin, a[i]);  
              } 

		  System.out.println(f);
		 
		 
		 }
	 }
}