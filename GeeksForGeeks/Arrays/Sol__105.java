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
		  
	
		 int a[] = new int[n];
		 int j,k=0,l=0;
		 HashSet<Integer> hs = new HashSet<>();
		 
		  for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     hs.add(a[j]);
		  } 
		  
		  
		  for(j=0;j<n;j++){
		     if(!hs.contains(a[j]-1)){
		        k=a[j];
		      
		       while (hs.contains(k)) 
                    k++;   
              
              l=Math.max(k-a[j],l);    
		     }
		        
		  } 
		    System.out.println(l);
		  
		}
	 }
}