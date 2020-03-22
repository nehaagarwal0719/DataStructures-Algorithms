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
		    p(n);
		    System.out.println();
		}
		
	}
	
	public static void p(int n){
	    if(n==1)
	      System.out.print(1 + " ");
	    else {
	         p(n-1);
	        System.out.print(n + " ");
	    }
	        
	}
}
