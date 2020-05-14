
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		  
	
		 int a[] = new int[n];
		 int j,c=1,l;
		 
		  for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		  } 
		  
		  l=a[0];
		  for(j=1;j<n;j++){
		     if(a[j]>=l){
		         l=a[j];
		         c++;
		     }
		  }
		  
		  System.out.println(c);
		  
		  
		}	  
	}
}

//DONT FORGET THE = SIGN IN 26