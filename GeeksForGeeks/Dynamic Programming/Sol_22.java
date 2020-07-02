import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		 
	        
		 char s1[] = new char[m],s2[] = new char[n],j,i,s=0;
		     
		     s1=sc.next().toCharArray();  
		     s2= sc.next().toCharArray();
 
		 int t[][]=new int[m+1][n+1];
		 
	     for (i = 0; i <= n; ++i) 
              t[0][i] = 0; 
        
          for (i = 0; i <= m; ++i) 
              t[i][0] = 1; 
               
		 for(i=1;i<=m;i++){
		     for(j=1;j<=n;j++){
		        if(s1[i-1]==s2[j-1])
		           t[i][j]=t[i-1][j-1]+t[i-1][j];
		         else
		          t[i][j]=t[i-1][j];
		     }
		 }
		     System.out.println(t[m][n]);
		}
	}
}