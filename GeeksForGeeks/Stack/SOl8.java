/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    
		 Stack<Integer> right = new Stack<>();
		 int left=1;
		 StringBuffer sb=new StringBuffer();
		for(int j=0;j<s.length();j++){
		    char ch=s.charAt(j);
		    if(ch=='('){
		        right.push(left);
		        sb.append(right.peek()+" ");
		        left++;
		    }
		    if(ch==')'){
		       sb.append(right.peek()+" ");
		       right.pop();
		    }
		} 
		  System.out.println(sb); 
		}
		
		
	}
	
	
}