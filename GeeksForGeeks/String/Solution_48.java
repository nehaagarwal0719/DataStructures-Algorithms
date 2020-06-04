import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int T=sc.nextInt();
	  
	  for(int k=1;k<=T;k++){
	     String s=sc.next();
	  int res=0;  
	  for(int i=0;i<s.length();i++){
	      int val=value(s.charAt(i));
	      if(i+1<s.length()){
	          int val1=value(s.charAt(i+1));
	          if(val<val1){
	            res+=val1-val;
	            i++;
	          }
	          else
	           res+=val;
	      }
	      else
	        res+=val;
	        
	  }   
	     
	     System.out.println(res);
	     
	  }        
	}
	
	public static int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
}