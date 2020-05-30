import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
	
		 int a[] = new int[n],f=0,j,ans=Integer.MAX_VALUE;
		 int mi=Integer.MAX_VALUE;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		    a[j]=rev(a[j]);
		 }
		 
		 Arrays.sort(a);
		 
		 //for(j=0;j<n;j++){
		   // System.out.println(a[j]+" ");
		 //}
		 
		  for (j = 1; j < n; j++) 
            ans = Math.min(ans, Math.abs(a[j] - a[j- 1])); 
		  System.out.println(ans);
	  }
	}	
	public static int rev(int n){
	    int reversed=0;
	    
	     while(n!= 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
	    return reversed;
	}
}