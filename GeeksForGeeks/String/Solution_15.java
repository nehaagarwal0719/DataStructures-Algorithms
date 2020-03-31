
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	    int r=0,g=0;
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    String s =sc.next();
		    r=0;g=0;
		for(int j=0;j<s.length();j++){
		    if(s.charAt(j)=='R')
		      r++;
		    else
		      g++;
		}
		if(r>g)
		 System.out.println(g);
		else
		  System.out.println(r);
	}
}
}