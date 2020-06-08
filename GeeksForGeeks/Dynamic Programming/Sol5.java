import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int n=sc.nextInt();
	        
		 int a[] = new int[n],j,s=0;
		     
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();    
		     s+=a[j];
		 }   
		     
		  if(s%2!=0)
		   System.out.println("NO");
		  else{ 
		      int S=s/2;
		   boolean lt[][]= new boolean[n+1][S+1];
		   int i;
		   
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
		     if(lt[n][S])
		       System.out.println("YES");
		     else
		       System.out.println("NO");
		  }
	}
  }	
}