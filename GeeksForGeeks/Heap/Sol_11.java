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
		 
		 PriorityQueue<Long> heap =new PriorityQueue<Long>();
	
		 long cost=0;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     heap.add((long)a[j]);
		 }
		 
		 while(heap.size()>=2){
		     long f=heap.peek();
		      heap.remove();
		     long s=heap.peek();
		      heap.remove();    
		     cost+=f+s;
		     heap.add(f+s);
		 }
		 
		 
		System.out.println(cost);
		}	 
	}
}