FFECIENT-

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
		 
		 int d[] = new int[n];
		 
		 String line1 = br.readLine(); // to read multiple integers line
         String[] strs1 = line1.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     d[j]=Integer.parseInt(strs1[j]);
		    
		 }
		 
		 Arrays.sort(a);
		 Arrays.sort(d);
		 
		 int c=1,max=1,i=0;j=1;
		 
		 while(i<n && j<n){
		     if(d[i] < a[j]){
		       c--;i++;
		     }
		     
		     if(d[i]>=a[j]){
		         c++;
		         j++;
		     }
		     if(c>max)
		      max=c;
		 }

		    System.out.println(max); 
		 }
	 }
}


---------------------------------------------------------------------------

NAIVE -

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n], d[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		  for(j=0;j<n;j++){
		     d[j]=sc.nextInt();
		 }
		 
		 
		 int s[]=new int[n];
		 int c=1;
		 s[0]=d[0];
		  for(j=1;j<n;j++){
		      int f=0;
		      for(int k=0;k<c;k++)
		           if(a[j]>s[k]){
		             s[k]=d[j];
		             f=1;     
		             break;
		           }
		          if(f==0){
		            s[c++]=d[j];
		          }
		      }
		    System.out.println(c); 
		 }
	 }
}