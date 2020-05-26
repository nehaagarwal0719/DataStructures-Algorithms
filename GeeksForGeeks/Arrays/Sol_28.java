import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 int l=a[0],s=Integer.MIN_VALUE;
		 int ln=a[0],sn=-Integer.MIN_VALUE;
		 
		 for(j=1;j<n;j++){
		     if(a[j]>l){
		      s=l;   
		      l=a[j];
		     }    
		     
		   else if(a[j]>s)
		     s=a[j];
		        
		 }
		 System.out.println(l*s);
		}
	}
}