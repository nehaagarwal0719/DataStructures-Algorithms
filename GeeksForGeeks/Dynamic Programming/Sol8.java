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
		     
		 int W=n;    
		     
		 int t[][]=new int[n+1][W+1];
		 
		 for(i=0;i<=n;i++){
		     for(j=0;j<=W;j++){
		         if(i==0||j==0)
		           t[i][j]=0;
		         else if(i<=j)
		           t[i][j]=Math.max(val[i-1]+ t[i][j-i], t[i-1][j]);
		         else
		           t[i][j]=t[i-1][j];
		     }
		 }
		 System.out.println(t[n][W]);
		}
	}
}

// YOU CAN EVEN TAKE A DIFFERENT ARRAY FOR LENGTH AND STORE 1 TO N IN THAT CONSECUTIVELY  and maybe only selective lenngths are involved in that case it will
//be same as unbounded knapsack
 