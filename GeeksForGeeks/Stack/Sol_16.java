import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    String s=sc.next();
		   
		    Stack<Character> st = new Stack<>();
		    
		    for(int j=0;j<s.length();j++){
		        char ch=s.charAt(j);
		  
		        if(ch=='{' || ch=='(' || ch=='[' )
		          st.push(ch);
		          
		        else if( ch=='}' && !st.isEmpty() && st.peek()=='{')
		          st.pop();
		          
		        else if( ch==']' && !st.isEmpty() && st.peek()=='[')
		          st.pop();
		          
		       else if( ch==')' && !st.isEmpty() && st.peek()=='(')
		          st.pop();   
		       else
		        st.push(ch);
		      
		    }
		    
		    if(st.isEmpty())
		      System.out.println("balanced");
		    else
		      System.out.println("not balanced");
		}
	}
}