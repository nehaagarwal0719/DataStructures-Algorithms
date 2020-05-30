import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    String s=sc.next();
		    
		    int c=0,res=0,j;
		Stack<Integer> st= new Stack<Integer>();
		st.push(-1);
		
	    for( j=0;j<s.length();j++){
	        char ch=s.charAt(j);
	        
	        if(ch=='(')
	          st.push(j);
	        else{
	            st.pop();
	            
	            if(!st.isEmpty())
	              res=Math.max(res, j-st.peek());
	              
	             else
	               st.push(j);

	        }
	    }      
		   System.out.println(res);
		}    
	}
}