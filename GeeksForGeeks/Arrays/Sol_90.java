import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int m=1;m<=T;m++){
		    int n=sc.nextInt();
	        int k=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 Deque<Integer> q= new LinkedList<>();
		 
		 StringBuilder res=new StringBuilder();
		 
		 for(j=0;j<k;j++){

		     while(!q.isEmpty() && a[j]>=a[q.peekLast()])
		           q.removeLast();
		
		     q.add(j);
		 }
		 
		 res.append(a[q.peek()]+" ");
		 
		  for(j=k;j<n;j++){
		    
		      while(!q.isEmpty() && q.peek()<=j-k)
		           q.remove();
		           
		       while(!q.isEmpty() && a[j]>=a[q.peekLast()])
		           q.removeLast(); 
	          
	          q.add(j);
	          
		      res.append(a[q.peek()]+" ");  
		      
		 }
		  System.out.println(res);
		} 
	}
}