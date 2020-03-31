/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    String lar="";
		    String sar[]=new String[n];
		    
		    for(int j=0;j<n;j++)
		      sar[j]=sc.next();
		     
		    String s =sc.next();
		    
		    for(int j=0;j<n;j++){
		        int l=0;
		         for (int k = 0; k < s.length() && l < sar[j].length(); k++) 
                    { 
                        if (s.charAt(k) == sar[j].charAt(l))  
                        { 
                            l++;
                        } 
                    } 
                    
                    if(l==sar[j].length()  && sar[j].length()>lar.length())
		                lar=sar[j];
		    }
		     System.out.println(lar);
		}    
	}
}