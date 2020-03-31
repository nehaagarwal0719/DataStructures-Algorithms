import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    if(s.charAt(0)==s.charAt(1))
		      System.out.println("DRAW");
		    else if(s.charAt(0)=='R' && s.charAt(1)=='S')
		       System.out.println('A');
		    else if(s.charAt(0)=='P' && s.charAt(1)=='R')
		       System.out.println('A'); 
		    else if(s.charAt(0)=='S' && s.charAt(1)=='P')
		       System.out.println('A'); 
		   else
		       System.out.println('B'); 
		}   
	}
}