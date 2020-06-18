import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int h=1;h<=T;h++){
		    int n=sc.nextInt();
	        
		 int a[] = new int[n],j,i,maS=0;
		     
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();    
		 }   
		 
		 int t[][]=new int[n][n];
		 for (int[] row : t) 
            Arrays.fill(row, -1); 
		 
		 System.out.println(solve(a,1,n-1,t));
		}	 
	}
	
	static int solve (int a[], int i,int j,int t[][]){
	    if(i==j)
	      return 0;
	    
	    if(t[i][j]!=-1)
	      return t[i][j];
	      
	    int min=Integer.MAX_VALUE;
	    
	    for(int k=i;k<j;k++){
	        int temp=solve(a,i,k,t)+solve(a,k+1,j,t)+ a[i-1]*a[k]*a[j];
	        min=Math.min(min,temp);
	    }
	     return t[i][j]=min;
	      
	}
}