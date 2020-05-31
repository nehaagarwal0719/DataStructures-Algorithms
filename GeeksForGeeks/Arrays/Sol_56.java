import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)  throws IOException  {
		
		//Scanner sc = new Scanner(System.in);
	    BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
		
        int T = Integer.parseInt(br.readLine()); 
        
		for(int i=1;i<=T;i++){
		    int n=Integer.parseInt(br.readLine()); 
	    
		 int a[] = new int[n],j;
		 
		 String s= br.readLine();
		 String[] s1 = s.split(" ");
		 
		 for(j=0;j<n;j++){
		     //a[j]=Integer.parseInt(br.readLine());
		     a[j]=Integer.parseInt(s1[j]);
		 }
		 
		   System.out.println(index(a,n));
		 }  
	  }	 
	  
	  public static int index(int a[],int n){
	      int sum=0,i,ls=0;
	      for(i=0;i<n;i++)
	        sum+=a[i];
	      
	      for(i=0;i<n;i++) {
	        sum-=a[i];
	        if(sum==ls)
	         return i+1;
	        ls+=a[i];
	      } 
	     return -1; 
	  }
}
