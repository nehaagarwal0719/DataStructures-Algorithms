import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    String s=sc.next();
		    
		    Stack<Character> st = new Stack<>();
		    String res="";
		    for(int j=0;j<s.length();j++){
		        char c=s.charAt(j);
		        if(Character.isLetterOrDigit(c))
		          res+=c;
		          
		        else if (c=='('){
        		  st.push('(');
		        }    

		        else if (c==')'){
        		  while(!st.isEmpty() && st.peek()!='(')
        		      res+=st.pop();
        		   if(!st.isEmpty() && st.peek()=='(')    
        		     st.pop();   
        		 
		        }
		        
        		else {
        		    while (!st.isEmpty() && prec(c) <= prec(st.peek())){ 
                   // if(st.peek() == '(') 
                     //   return "Invalid Expression"; 
                    res += st.pop(); 
                 } 
                st.push(c); 
        		}
		    }
		  while (!st.isEmpty()){ 
      //      if(stack.peek() == '(') 
        //        return "Invalid Expression"; 
            res += st.pop(); 
           } 
		    System.out.println(res);
		}
	}
	
	public static int prec( char ch){
	    switch(ch){
	        case '+':
	        case '-':
	            return 1;
	        case '*':
	        case '/':
	            return 2;
	        case '^':
	            return 3;
	    }
	    return -1;
	} 
}