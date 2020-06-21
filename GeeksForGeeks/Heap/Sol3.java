import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    
		int T=Integer.parseInt(br.readLine());
		
         
		for(int i=1;i<=T;i++){
		    
		    int j;
	    	String line1 = br.readLine(); // to read multiple integers line
            String[] strs1 = line1.trim().split("\\s+"); 
            
		    int n=Integer.parseInt(strs1[0]);
		    int k=Integer.parseInt(strs1[1]);
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
		 
		 PriorityQueue<Integer> heap =  
             new PriorityQueue<Integer>();
             
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		     heap.add(a[j]);
		     if(heap.size()>k)
		       heap.remove();
		 }
		 ArrayList<Integer> al = new ArrayList<>(heap);
		 
		 Collections.sort(al, Collections.reverseOrder());

		 StringBuilder res= new StringBuilder();
		 
		 for(int temp:al)
		 // res.append(temp+" ");
		  System.out.print(temp+" ");
		 System.out.println(); 
		 
	  } 
	}
}