import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

	  Scanner sc = new Scanner(System.in);
	  
	  int T=sc.nextInt();
	  
	  for(int k=1;k<=T;k++){
	     String s=sc.next();
	     int i=0,c=0;
	     while(i<s.length()){
	         if(s.charAt(i)=='O'){
	            c++;
	            i++;
	            while(i<s.length() && s.charAt(i)!='E')
	            i++;
	         }
	         else
	          i++;
	            
	     }
	     
	     System.out.println(c);
	  }
	}
}