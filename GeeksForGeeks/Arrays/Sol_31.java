/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    double p=sc.nextDouble();
	
		 int j,c=0;
		 ArrayList<Double> al= new ArrayList<>();
		 
		 for(j=0;j<n;j++){
		     al.add(sc.nextDouble());
		 } 
		 
		 for(j=0;j<n;j++){
		     if(p% al.get(j) ==0 &&al.contains(p/al.get(j))){
		       c++;
		       break;
		     }     
		 } 
		 if(c>0)
		  System.out.println("Yes");
		 else
		  System.out.println("No");
		    
		}
	}
}