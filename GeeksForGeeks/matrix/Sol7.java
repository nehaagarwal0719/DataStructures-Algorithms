
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int q=1;q<=T;q++){
		  
		    int n=sc.nextInt();
		    
		 int a[][] = new int[n][n];
		 int j,i,c=0;
		 
		 PriorityQueue<Integer> pq= new PriorityQueue<>();
		 
		 for(i=0;i<n*n;i++){
		       pq.add(sc.nextInt());
		       
		  }
		  
		  while(!pq.isEmpty()){
		      System.out.print(pq.peek()+" ");
		      pq.remove();
		  }
		  
		  System.out.println();
		}
	}
}