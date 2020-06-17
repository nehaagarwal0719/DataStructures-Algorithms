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
		     a[j]=a[j]-1;
		 }
		 
		 StringBuffer res=new StringBuffer();
		 
		 for(j=0;j<n;j++){
		     a[a[j]%n] = a[a[j]%n] + n;
		 }
		 
		 for(j=0;j<n;j++){
		     res.append(a[j]/n+" ");
		 }
		 System.out.println(res);
		} 
	}
}