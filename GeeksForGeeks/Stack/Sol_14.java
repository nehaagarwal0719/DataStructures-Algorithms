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
		
		    Stack<Integer> st = new Stack<>();
		    for(int j=0;j<s.length();j++){
		        char c=s.charAt(j);
		        if(Character.isDigit(c))
		          st.push(c- '0');
		        else{
        		        int val1 = st.pop(); 
                        int val2 = st.pop(); 
                          
                        switch(c) 
                        { 
                            case '+': 
                            st.push(val2+val1); 
                            break; 
                              
                            case '-': 
                            st.push(val2- val1); 
                            break; 
                              
                            case '/': 
                            st.push(val2/val1); 
                            break; 
                              
                            case '*': 
                            st.push(val2*val1); 
                            break; 
                      } 
		        }    
		       // System.out.println(st.peek());
		    }
		    
		    System.out.println(st.pop());
		}
	}
}

----------------------------------------------------------------------------------------------------------------------
for multiple digits
 static int evaluatePostfix(String exp) 
    { 
        //create a stack 
        Stack<Integer> stack = new Stack<>(); 
          
        // Scan all characters one by one 
        for(int i = 0; i < exp.length(); i++) 
        { 
            char c = exp.charAt(i); 
              
            if(c == ' ') 
            continue; 
              
            // If the scanned character is an operand  
            // (number here),extract the number 
            // Push it to the stack. 
            else if(Character.isDigit(c)) 
            { 
                int n = 0; 
                  
                //extract the characters and store it in num 
                while(Character.isDigit(c)) 
                { 
                    n = n*10 + (int)(c-'0'); 
                    i++; 
                    c = exp.charAt(i); 
                } 
                i--; 
  
                //push the number in stack 
                stack.push(n); 
            } 
              
            // If the scanned character is an operator, pop two 
            // elements from stack apply the operator 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
            } 
            } 
        } 
        return stack.pop();  
    } 
      
	