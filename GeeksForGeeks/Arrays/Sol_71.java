import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
	       
	        
		 int a[] = new int[m],b[] = new int[n],j;
		 HashSet<Integer> hs= new HashSet<>();
		 HashSet<Integer> hs1= new HashSet<>();
		 for(j=0;j<m;j++){
		     a[j]=sc.nextInt();
		     hs.add(a[j]);
		 }
		 int c=0;
		 for(j=0;j<n;j++){
		     b[j]=sc.nextInt();
		     if(hs.contains(b[j]) && !hs1.contains(b[j])){
		        c++; 
		     }  
		       hs1.add(b[j]);
		 }

		  System.out.println(c);
		}
		 
	}
}