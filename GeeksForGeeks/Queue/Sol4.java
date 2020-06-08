import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    System.out.println(check(s));
		}
	}
	
	public static int check(String s){
	    if(s.length()%2!=0)
	      return -1;
	    Stack<Character> st = new Stack<>();
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch=='}' && !st.isEmpty() && st.peek()=='{')
	            st.pop();
	        else
	           st.push(ch);
	    }
	    int n=0;
	    int rem=st.size();
	    while(!st.isEmpty()){
	      if(st.peek()=='}')
	        n++;
	      st.pop();     
	    }
	    
	   // int q=rem-n;
	   // return (int)Math.ceil(n/2);
	  // return Math.ceil(q/2);
	  //return rem-n;
	  return rem/2 + n%2;
	}
}