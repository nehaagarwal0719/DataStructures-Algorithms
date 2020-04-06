/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		 int c[] = new int[n];
		 int p[] = new int[n];
		 for( j=0;j<n;j++){
		     c[j]=sc.nextInt();
		 } 
		 
		 for( j=0;j<n;j++){
		     p[j]=sc.nextInt();
		 }
		 
		 int pen=0;
		 
		 if(d%2==0){
		     for(j=0;j<n;j++){
		         if(c[j]%2!=0)
		           pen+=p[j];
		     }
		 }
		 else{
		     for(j=0;j<n;j++){
		         if(c[j]%2==0)
		           pen+=p[j];
		     }
		 }
		 
		 System.out.println(pen);
	}
	}
}