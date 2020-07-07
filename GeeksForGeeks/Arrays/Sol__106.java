/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        int sum=sc.nextInt();
		int a[] = new int[n],j;
		 
		HashMap<Integer,Integer> hs= new HashMap<>(); 
		for(int m=0;m<n;m++){
		     a[m]=sc.nextInt();
		     hs.put(a[m],m);
		}
		int f=0;
		 for(int m=0;m<n;m++){
		     if(hs.containsKey(sum-a[m]) && m!=hs.get(sum-a[m])){
		        System.out.println("Yes");
		        f=1;
		        break;
		     }  
		}
		 if(f==0)
		   System.out.println("No");
	  }
	}
}