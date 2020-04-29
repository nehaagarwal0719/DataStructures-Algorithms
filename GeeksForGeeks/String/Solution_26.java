import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		int c=0;
		
		for(int j=0;j<s.length();j++){
		    if(s.charAt(j)=='1')
		        c++;
		}    
	    
	    System.out.println(c*(c-1)/2);
  	}
  }
}