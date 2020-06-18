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
		 
		 Stack<Pair> stL = new Stack<>();
		 Stack<Pair> stR = new Stack<>();
		 
		 ArrayList<Long> sbL = new ArrayList<>();
		 ArrayList<Long> sbR = new ArrayList<>();
		 
		 for(j=0;j<a.length;j++){
		     if(stL.isEmpty())
		        sbL.add((long)-1);
		       
		     else if(!stL.isEmpty() && a[j]>stL.peek().ele)
		             sbL.add(stL.peek().ind);
		           
		     else{         
		         while(!stL.isEmpty() && stL.peek().ele>=a[j])
		            stL.pop();
		        if (stL.isEmpty())
		             sbL.add((long)-1);
		        else
		             sbL.add(stL.peek().ind);
		        }
		     
		     stL.push(new Pair((long)a[j],(long)j));       
		 }
		 
		 for(j=a.length-1;j>=0;j--){
		     if(stR.isEmpty())
		        sbR.add((long)a.length);
		       
		     else if(!stR.isEmpty() && a[j]>stR.peek().ele)
		             sbR.add(stR.peek().ind);
		           
		     else{         
		         while(!stR.isEmpty() && stR.peek().ele>=a[j])
		            stR.pop();
		        if (stR.isEmpty())
		             sbR.add((long)a.length);
		        else
		             sbR.add(stR.peek().ind);
		        }
		     
		     stR.push(new Pair((long)a[j],(long)j));       
		 }
		 Collections.reverse(sbR);
         long max=0;
		 for(j=0;j<n;j++)
		   max=Math.max(((sbR.get(j)-sbL.get(j)-1)*a[j]),max);
	
		System.out.println(max);
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