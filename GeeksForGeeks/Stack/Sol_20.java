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
		 
		 Stack<Pair> st = new Stack<>();
		 ArrayList<Long> sb = new ArrayList<>();;
		 
		 
		 for(j=0;j<a.length;j++){
		     if(st.isEmpty())
		        sb.add((long)-1);
		       
		     else if(!st.isEmpty() && a[j]<st.peek().ele)
		             sb.add(st.peek().ind);
		           
		     else{         
		         while(!st.isEmpty() && st.peek().ele<=a[j])
		            st.pop();
		        if (st.isEmpty())
		             sb.add((long)-1);
		        else
		             sb.add(st.peek().ind);
		        }
		     
		     st.push(new Pair((long)a[j],(long)j));       
		 }
		// Collections.reverse(sb);
		 //StringBuilder sb1 =new StringBuilder();
		 for(j=0;j<sb.size();j++)
		   System.out.print(j-sb.get(j)+" ");
	
		 System.out.println();
		}
	}
}

class Pair implements Comparable<Pair>{
    public long ele, ind;
    public Pair(long A, long B){
        ele = A;ind =B;
    }
    public int compareTo(Pair o) {
			if (this.ele == o.ele) {
				return (this.ind > o.ind) ? 1 : (this.ind == o.ind) ? 0 : -1;
			}else if(this.ele < o.ele) {
				return -1;
			}else {
				return 1;
			}
	}
}	