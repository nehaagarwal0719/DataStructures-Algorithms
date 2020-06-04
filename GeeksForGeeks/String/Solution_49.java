import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int T=sc.nextInt();
	  
	  for(int k=1;k<=T;k++){
	     String s=sc.next();
	     int target=sc.nextInt();
	    
	     int res=ans(s,target);
	     System.out.println(res);
	    
    	
	  }
	}
	
	public static int ans(String s, int target){
	     int i=0,c=1;
	      while(i<s.length()){
    	      if(i<=target)
    	        i++;
    	      else if(s.charAt(i)=='['){
    	        c++;i++;
    	      }
    	      else if(s.charAt(i)==']'){
    	          c--;
    	          if(c==0)
    	           break;
    	          i++;    
    	      }
    	      else
    	       i++;
    	  }
    	  
    	  return i;
	}
}