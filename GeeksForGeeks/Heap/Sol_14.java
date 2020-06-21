ackage whatever //do not write package name here */

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
		 
		 PriorityQueue<Integer> heap =new PriorityQueue<Integer>(Collections.reverseOrder());
		 HashMap<Integer,Integer> hm=new HashMap<>();
	
		 int c=0;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     if(hm.containsKey(a[j]))
                hm.put(a[j],hm.get(a[j])+1);
            else
                hm.put(a[j],1);
		 }
		  for (Map.Entry mapElement : hm.entrySet()) { 
            int value = (int)mapElement.getValue(); 
		     heap.add(value);
        } 
        
        while(k>0){
            int t=heap.remove();
            t--;
            if(t>0)
              heap.add(t);
              
            k--;  
        }
        
        System.out.println(heap.size());
		}
	}
}