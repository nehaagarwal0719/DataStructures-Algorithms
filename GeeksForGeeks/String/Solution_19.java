/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s1 =sc.next();
		    String s2=s1.replaceAll("ac","");
		    String s3= s2.replaceAll("b","");
		    
		    System.out.println(s3);
		}    
	}
}