import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int k=sc.nextInt();
	        int n=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 PriorityQueue<Integer> heap =new PriorityQueue<Integer>();
		 StringBuilder res= new StringBuilder();
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     heap.add(a[j]);
		     
		    if(heap.size()>k){
		         heap.remove();
		         res.append(heap.peek()+" ");
		     }
		     else if(heap.size()==k){
		         res.append(heap.peek()+" ");
		     }  
		     else{
		         res.append(-1+" ");
		     }
		 }
		 
		System.out.println(res);
		}	 
	}
}