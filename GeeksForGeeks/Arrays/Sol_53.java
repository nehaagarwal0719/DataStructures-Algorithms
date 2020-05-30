import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int m=sc.nextInt();
		    int  n=sc.nextInt();
	
	
		 long a[] = new long[m],b[]= new long[n];
		 int j;
		 HashSet<Long> hs = new HashSet<>();
		 
		 for(j=0;j<m;j++){
		     a[j]=sc.nextLong();
		 }
		 
		 for(j=0;j<n;j++){
		     b[j]=sc.nextLong();
		     hs.add(b[j]);
		 }
		 
		 for(j=0;j<m;j++){
		     if(!hs.contains(a[j]))
		       System.out.print(a[j]+" ");
		 }
		 
		 System.out.println();
		 
		} 
	}
}