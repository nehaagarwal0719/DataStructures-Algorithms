import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int W=sc.nextInt();   
		    int n=sc.nextInt();
		 
		 int wt[] = new int[n],j,i,s=0;
		     
		 for(j=0;j<n;j++)
		     wt[j]=sc.nextInt();  
		     
		 
		 int t[][]=new int[n+1][W+1];
		 for(i=0;i<=W;i++)
		   t[0][i]=Integer.MAX_VALUE-1;
		   
		 for(i=1;i<=n;i++)
		   t[i][0]=0; 
		   
		 for(i=1;i<=W;i++){
		    if(i%wt[0]==0)
		     t[1][i]=i/wt[0];
		    else
		     t[1][i]=Integer.MAX_VALUE-1;
		 }
		   
		 
		 for(i=2;i<=n;i++){
		     for(j=1;j<=W;j++){
		        
		         if(wt[i-1]<=j)
		           t[i][j]=Math.min(t[i][j-wt[i-1]]+1,t[i-1][j]);
		         else
		           t[i][j]=t[i-1][j];
		     }
		 }
		 if(t[n][W]==Integer.MAX_VALUE -1)
		  System.out.println(-1);
		 else 
		  System.out.println(t[n][W]);
		}
	}
}