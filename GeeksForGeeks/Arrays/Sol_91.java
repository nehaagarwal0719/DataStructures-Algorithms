
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	         
	    InputStreamReader r1=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r1);    
    
		int T=Integer.parseInt(br.readLine());
		
		int j;
	
         
		for(int i=1;i<=T;i++){
		     
		  String line1 = br.readLine(); // to read multiple integers line
         String[] strs1 = line1.trim().split("\\s+");
         
		     int n=Integer.parseInt(strs1[0]);
		     
		     int sum=Integer.parseInt(strs1[1]);
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
		 
		 int l=0,r=0,curs=0,f=0;
		 
		 while(r<=n){
		      while(curs>sum && l<r-1){
		            curs-=a[l];
		            l++;
		     }
		     
		   if(curs==sum){
		         f=1;
		         break;
		     }
		     
		     if(r<n){
		       curs=curs+ a[r];
		       
		     }
		     r++;
		 }


		
		 if(f==1)
		 System.out.println((l+1)+" "+(r));
		 else
		 System.out.println(-1);
	  } 
	}
}