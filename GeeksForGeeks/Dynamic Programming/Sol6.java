import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        
		 int a[] = new int[n],j,S=0;
		     
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();    
		     S+=a[j];
		 }   
		 
		 boolean lt[][]= new boolean[n+1][S+1];
		   int i,min=Integer.MAX_VALUE;
		   
		    for (i = 1; i <= S; i++) 
               lt[0][i] = false; 
               
            for (i = 0; i <= n; i++) 
                lt[i][0] = true; 
           
           for(i=1;i<=n;i++){
               for(j=1;j<=S;j++){
                   if(a[i-1]<=j)
                    lt[i][j]=lt[i-1][j-a[i-1]] || lt[i-1][j] ;
	               else 
	                lt[i][j]=lt[i-1][j];
	               
               }
           } 
           
           for(i=S/2;i>=0;i--){
               if(lt[n][i]){
                   min=S-2*i;
                   break;
               }
           }
          System.out.println(min);    
		}
	}
}