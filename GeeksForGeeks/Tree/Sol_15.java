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
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 int f=0;
		 
		 for(int j=0;j<n-1;j++){
		    if(a[j]>=a[j+1]){
		        f=1;break;
		    }
		 } 

             if(f==0)
              System.out.println(1);
             else
              System.out.println(0);
		 }
	
	}
}