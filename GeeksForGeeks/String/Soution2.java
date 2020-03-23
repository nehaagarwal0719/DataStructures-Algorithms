/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int c=0;
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    char ch[]=s.toCharArray();
		    c=0;
		    for(int j=0;j<ch.length;j++){
		        if(Character.isUpperCase(ch[j]))
		          c++;
		    }
		   System.out.println(c); 
		}   
	}
}
