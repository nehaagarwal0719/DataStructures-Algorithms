
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		 
	      int j,i,s=0;
		    int m=sc.nextInt(); 
		    char s1[]=sc.next().toCharArray();  
		    
		    int n=m;
		    char s2[]= new char[m];
		    
		    for(j=0;j<m;j++)
              s2[j]=s1[j];
             
 
		 int t[][]=new int[m+1][n+1];
		 
		 for(i=0;i<=m;i++){
		     for(j=0;j<=n;j++){
		         if(i==0|| j==0)
		          t[i][j]=0;
		     }
		 }
		 
		 for(i=1;i<=m;i++){
		     for(j=1;j<=n;j++){
		        if(s1[i-1]==s2[j-1] && i!=j)
		           t[i][j]=1+ t[i-1][j-1];
		         else
		          t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
		     }
		 }
		     int lcs=t[n][n];
		     
		     System.out.println(lcs);
		}
	}
}