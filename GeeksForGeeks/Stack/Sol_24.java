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
		
		for(int i=1;i<=T;i++){
		    int n=Integer.parseInt(br.readLine());
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
		 
		 
		 int l=0,r=n-1,lmax=0,rmax=0,res=0;
		 while(l<=r){
		     if(a[l]<a[r]){
		        if(a[l]>lmax)
		           lmax=a[l];
		        else
		           res+=lmax-a[l];
		        l++;     
		     } 
		     else{
		         if(a[r]>rmax)
		          rmax=a[r];
		         res+=rmax-a[r];
		         r--;
		     }
		 }
		 
		 System.out.println(res);
		 
		}
	 }
}