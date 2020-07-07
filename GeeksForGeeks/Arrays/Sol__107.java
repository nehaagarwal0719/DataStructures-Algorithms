import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        
		int a[] = new int[n],j;
		 
		HashMap<Integer,Integer> hs= new HashMap<>(); 
		for(int m=0;m<n;m++){
		     a[m]=sc.nextInt();
		     if(hs.containsKey(a[m]))
		       hs.put(a[m],hs.get(a[m])+1);
		     else
		      hs.put(a[m],1);
		       
		}
		int sum=sc.nextInt();        
		
		int c=0;
		
		 for(int m=0;m<n;m++){
		     if( sum!=0 && hs.containsKey(a[m]+sum))
		       c++;
		    if( sum!=0 && hs.containsKey(a[m]-sum))
		       c++;     
		    if( sum==0 && hs.containsKey(a[m]) && hs.get(a[m])>1)
		        c++;     
		  if(hs.containsKey(a[m]))
		    hs.remove(a[m]) ;     
		       
		}
		   System.out.println(c);
	  }
	}
}