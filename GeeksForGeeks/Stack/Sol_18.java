import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	     InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    
		int T=Integer.parseInt(br.readLine());
		
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=Integer.parseInt(br.readLine());
		    
		 long a[] = new long[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Long.parseLong(strs[j]);
		    
		 }
		 
		 Stack<Long> st = new Stack<>();
		 ArrayList<Long> sb = new ArrayList<>();;
		 //st.push(-1);
		 
		 for(j=a.length-1;j>=0;j--){
		     if(st.isEmpty())
		        sb.add((long)-1);
		       
		     else if(!st.isEmpty() && a[j]<st.peek())
		             sb.add(st.peek());
		           
		     else{         
		         while(!st.isEmpty() && st.peek()<=a[j])
		            st.pop();
		        if (st.isEmpty())
		             sb.add((long)-1);
		        else
		             sb.add(st.peek());
		        }
		     
		     st.push((long)a[j]);       
		 }
		 Collections.reverse(sb);
		 StringBuilder sb1 =new StringBuilder();
		 for(j=0;j<sb.size();j++)
		   sb1.append(sb.get(j)+" ");
	
		 System.out.println(sb1);
		}
	}
}