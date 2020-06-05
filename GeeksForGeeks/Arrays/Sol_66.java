import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        int k=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		  int s=0;
		  for(j=0;j<k;j++){
		     s+=a[j];
		  }
		  int ms=s,ind=0;;
		  
		  for(j=k;j<n;j++){
		      s+=a[j]-a[j-k];
		      if(s<ms){
		        ms=s;
		        ind=j-k+1;
		      } 
		  }
		 System.out.println((ind+1)+ " "+ (ind+k));
	  }
	}
}