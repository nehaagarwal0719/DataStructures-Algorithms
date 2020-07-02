import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 int k=sc.nextInt();
		 
	     PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
	     
	     
		 for(j=0;j<n;j++){
		     q.add(a[j]);
		     if(q.size()>k)
		       q.remove();
		 }
		 
		 
	     System.out.println(q.remove());
	     

		} 
	}
}