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
		 
		 PriorityQueue<Integer> heap =new PriorityQueue<Integer>();
	
		 int c=0;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     heap.add(a[j]);
		 }
		 
		 while(heap.peek()<k && heap.size()>=2){
		     int a1=heap.peek();
		     heap.remove();
		     int b=heap.peek();
		     heap.remove();
		     heap.add(a1+b);
		     c++;
		 }
		 if(heap.peek()>=k)
		   System.out.println(c);
		 else
		   System.out.println(-1);
		} 
	}
}