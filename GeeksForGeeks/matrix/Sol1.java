import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int q=1;q<=T;q++){
		    int n=sc.nextInt();
		    
		 int a[][] = new int[n][n];
		 int j,i,c=0;
		 
		 for(i=0;i<n;i++){
		     for(j=0;j<n;j++)
		       a[i][j]=sc.nextInt();
		  } 
		 
		 for(i=0;i<n;i++){
		     for(j=i;j<n;j++){
		         int temp=a[i][j];
		         a[i][j]=a[j][i];
		         a[j][i]=temp;
		     }
		  }
		  
		  for(i=0;i<n;i++){
		     for(j=0;j<n;j++)
		       System.out.print(a[i][j]+" ");
		  } 
		  
		  System.out.println();
		}
	}
}