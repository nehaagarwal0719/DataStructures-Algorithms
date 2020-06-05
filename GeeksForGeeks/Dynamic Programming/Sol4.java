//RECURSION
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        int W=sc.nextInt();
	        
		 int wt[] = new int[n],val[] = new int[n],j;
		 
		 for(j=0;j<n;j++)
		     val[j]=sc.nextInt();
		     
		 for(j=0;j<n;j++)
		     wt[j]=sc.nextInt();    
		     
		 System.out.println(knapsack(wt,val,n,W));
	
	}
}	
	public static int knapsack(int wt[],int val[], int n, int W){
	    if(n==0 || W==0)
	      return 0;
	    else if(wt[n-1]<=W)
	      return Math.max((val[n-1]+knapsack(wt,val,n-1,W-wt[n-1])),
	                    knapsack(wt,val,n-1,W) );
	   else
	      return knapsack(wt,val,n-1,W) ;
	}
}



-----------------------------------------------------------------------------------------------------------------------------------
using memoization

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        int W=sc.nextInt();
	        
		 int wt[] = new int[n],val[] = new int[n],j;
		 
		 for(j=0;j<n;j++)
		     val[j]=sc.nextInt();
		     
		 for(j=0;j<n;j++)
		     wt[j]=sc.nextInt();    
		     
		   int lt[][]= new int[1001][1001];
           for (int[] row : lt) 
            Arrays.fill(row, -1);     
		     
		 System.out.println(knapsack(wt,val,n,W,lt));
	
	}
}	
	public static int knapsack(int wt[],int val[], int n, int W,int lt[][]){
	    if(n==0 || W==0)
	      return 0;
	     if(lt[n-1][W-1]!=-1)
	       return lt[n][W];
	       
	    else if(wt[n-1]<=W)
	      return lt[n][W]=Math.max((val[n-1]+knapsack(wt,val,n-1,W-wt[n-1],lt)),
	                    knapsack(wt,val,n-1,W,lt) );
	   else
	      return lt[n][W]= knapsack(wt,val,n-1,W,lt) ;
	}
}

---------------------------------------------------------------------------

//bottom up approach

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        int W=sc.nextInt();
	        
		 int wt[] = new int[n],val[] = new int[n],j;
		 
		 for(j=0;j<n;j++)
		     val[j]=sc.nextInt();
		     
		 for(j=0;j<n;j++)
		     wt[j]=sc.nextInt();    
		     
		   int lt[][]= new int[n+1][W+1];
           
           for(int i=0;i<=n;i++){
               for(j=0;j<=W;j++){
                   if(i==0 || j==0 )
                    lt[i][j]=0;
                   else if(wt[i-1]<=j)
                   lt[i][j]=Math.max((val[i-1]+lt[i-1][j-wt[i-1]]),
	                             lt[i-1][j] );
	               else 
	               lt[i][j]=lt[i-1][j];
	               
               }
           }   
		     
		 System.out.println(lt[n][W]);
	
	}
}	
}

------------------------------------------------------------------------------------

//TOOK INPUT THROUGH BUFFERED READER TO REMOVE TLE


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) throws Exception {
	;
	    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);    
    
		int T=Integer.parseInt(br.readLine());
		
		for(int k=1;k<=T;k++){
		    int n=Integer.parseInt(br.readLine());
	        int W=Integer.parseInt(br.readLine());
	        
		 int wt[] = new int[n],val[] = new int[n],j;
		 
		 String line = br.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        
		 for(j=0;j<n;j++)
		     val[j]=Integer.parseInt(strs[j]);
		     
		  String line1 = br.readLine(); // to read multiple integers line
        String[] strs1 = line1.trim().split("\\s+");   
        
		 for(j=0;j<n;j++)
		     wt[j]=Integer.parseInt(strs1[j]);    
		     
		   int lt[][]= new int[n+1][W+1];
           
           for(int i=0;i<=n;i++){
               for(j=0;j<=W;j++){
                   if(i==0 || j==0 )
                    lt[i][j]=0;
                   else if(wt[i-1]<=j)
                   lt[i][j]=Math.max((val[i-1]+lt[i-1][j-wt[i-1]]),
	                             lt[i-1][j] );
	               else 
	               lt[i][j]=lt[i-1][j];
	               
               }
           }   
		     
		 System.out.println(lt[n][W]);
	
	}
}	
}