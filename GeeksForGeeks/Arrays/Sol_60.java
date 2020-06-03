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
		 int s=0,s1=0;
		 
	
		 HashSet<Integer> hs1 = new HashSet<>();
		 
		 for(j=0;j<m;j++){
		     a[j]=sc.nextInt();
		     s+=a[j];
		 } 
		 
		 for(j=0;j<n;j++){
		     b[j]=sc.nextInt();
		     hs1.add(b[j]);
		     s1+=b[j];
		 } 
		 
		 int diff= Math.abs(s-s1)/2;
		 int c=0;
		 for(j=0;j<m;j++){
		     if(hs1.contains(a[j]+diff)){
		       c++;break;
		     } 
		 }  
		 if(c==0)
		  System.out.println(-1);
		 else
		  System.out.println(1);
		 
	  }	 
	}
}

sum1 - x + y = sum2 - y + x
2(y - x) = sum2 - sum1
2(y - x) = diff
y = x + diff/2

