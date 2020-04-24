/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();

	
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    int sum=0;String s1="";
		for(int j=0;j<s.length();j++){
		    if(Character.isLetter(s.charAt(j)))
		        s1=s1+s.charAt(j);
		    else
		       sum =sum + Character.getNumericValue(s.charAt(j));
		}
		    
		     char ch[]=s1.toCharArray();
		     Arrays.sort(ch);
		     String s2= new String(ch);
		    String sum1=Integer.toString(sum);
		    s2+=sum;
		    System.out.println(s2);
		}    
	}
}