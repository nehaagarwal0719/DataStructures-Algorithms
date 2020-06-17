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
		 
		 PriorityQueue<Integer> heap =new PriorityQueue<Integer>(Collections.reverseOrder());
	
		 long cost=0;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 int k1=sc.nextInt();
		 int k2=sc.nextInt();
		 
		  for(j=0;j<n;j++){
		      heap.add(a[j]);
		      if(heap.size()>k2)
		        heap.remove();
		  }
		 heap.remove();
		 while(heap.size()>k1){
		     cost+=heap.peek();
		      heap.remove();
		 }
		 
		 
		System.out.println(cost);
		}	 
	}
}