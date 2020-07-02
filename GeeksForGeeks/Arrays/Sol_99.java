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
		    
		  String line1 = br.readLine(); // to read multiple integers line
         String[] strs1 = line1.trim().split("\\s+");
		  
		   int n=Integer.parseInt(strs1[0]);
		    int k=Integer.parseInt(strs1[1]);
		
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
		  
		   for (j = 0; j < n; j += k) 
        { 
            int left = j; 
      
            // to handle case when k is not multiple 
            // of n 
            int right = Math.min(j + k - 1, n - 1); 
            int temp; 
              
            // reverse the sub-array [left, right] 
            while (left < right) 
            { 
                temp=a[left]; 
                a[left]=a[right]; 
                a[right]=temp; 
                left+=1; 
                right-=1; 
            } 
        } 
        for(j=0;j<n;j++){
		     System.out.print(a[j]+ " ");
		  }
		  System.out.println();
		}
	 }
}