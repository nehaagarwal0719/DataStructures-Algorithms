
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int j=1;j<=T;j++){
		    
		int n=sc.nextInt();
		
		int table[]=new int[n+1],i;
		
		Arrays.fill(table,0);
		
		table[0]=1;
		
		for(i=3;i<=n;i++)
		  table[i]+=table[i-3];
		
		for(i=5;i<=n;i++)
		  table[i]+=table[i-5];
		  
		for(i=10;i<=n;i++)
		  table[i]+=table[i-10];
		  
		  System.out.println(table[n]);
		
		}
		
	}
}