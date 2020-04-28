/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    String s1;
		for(int i=1;i<=T;i++){
		    s1 =sc.next();
		  
		
		int ans=check(s1);
		System.out.println(ans);
		}
	}
	public static int check(String s){
	    HashSet<String> hs= new HashSet<String>();
	    
	    for(int i=0;i<s.length();i++){
	         for(int j=i+1;j<=s.length();j++){
	           String sub=s.substring(i,j);
	           if(sub.length()==2)
	             hs.add(sub);
	       }
	    }
	    
	    return hs.size();
	}
}