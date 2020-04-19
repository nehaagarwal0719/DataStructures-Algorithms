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
		    String s2 =sc.next();
		    
		    char ch1[]=new char[s1.length()];
		    char ch2[]=new char[s2.length()];
		    ch1=s1.toCharArray();
		    ch2=s2.toCharArray();
		    
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		 
		    if(Arrays.equals(ch1, ch2))
		     System.out.println("YES");
		    else
		     System.out.println("NO");
		     
		}  
		    
	}
}

// better solution

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
		    String s2 =sc.next();
		    
		    if(check(s1,s2))
		     System.out.println("YES");
		    else
		     System.out.println("NO");
		   
		     
		}  
		    
	}
	
	static boolean check(String s1, String s2){
	    if(s1.length()!=s2.length())
	      return false;
	    
	    char[] all=new char[256];
	    
	    for(int i=0;i<s1.length();i++){
	      all[s1.charAt(i)]++;
	      all[s2.charAt(i)]--;
	    }
	    
	    for(int j=0;j<256;j++){
	        if(all[j]==1)
	        return false;
	    }
	    return true;
	      
	}
}