/*package whatever //do not write package name here */

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
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
		 
		 for(j=0;j<n-1;j++){
		     if(a[j+1]!=0 && a[j]==a[j+1]){
		         a[j]=2*a[j];
		         a[j+1]=0;
		     }
		 }
	     int k=0;
	     StringBuffer res=new StringBuffer();
	     for(j=0;j<n;j++){
	         if(a[j]!=0){
	             res.append(a[j]+" ");
	             k++;
	         }
	     }
		 
		 for(j=k;j<n;j++){
		   res.append(0+" ");
		 } 

		 System.out.println(res);
		}	 
	}
}