import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
		 
	        
		 int val[] = new int[n],j,i,s=0;
		     
		 for(j=0;j<n;j++)
		     val[j]=sc.nextInt();  
		     
		 int W=sc.nextInt();   
		     
		 int t[][]=new int[n+1][W+1];
		 for(i=1;i<=W;i++)
		   t[0][i]=0;
		 for(i=0;i<=n;i++)
		   t[i][0]=1; 
		 
		 for(i=1;i<=n;i++){
		     for(j=1;j<=W;j++){
		        
		         if(val[i-1]<=j)
		           t[i][j]=t[i][j-val[i-1]] + t[i-1][j];
		         else
		           t[i][j]=t[i-1][j];
		     }
		 }
		 System.out.println(t[n][W]);
		}
	}
}
