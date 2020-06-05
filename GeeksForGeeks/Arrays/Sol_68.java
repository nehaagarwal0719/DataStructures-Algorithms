import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        //int k=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 int min=a[0],diff=-1;
		 
		  for(j=1;j<n;j++){
		     if(a[j]-min>diff)
		       diff=a[j]- min;
		     else if(min>a[j])
		       min=a[j];
		  }    
		 
		 System.out.println(diff);
		 
		}	
	}
}