
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int q=1;q<=T;q++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    
		 int a[][] = new int[m][n];
		 int j,i,c=0;
		 
		 for(i=0;i<m;i++){
		     for(j=0;j<n;j++)
		       a[i][j]=sc.nextInt();
		  }
		  print(a,0,0,m,n);
		  System.out.println();
	  }  
	}
	
    static void print(int arr[][], int i, 
                      int j, int m, int n) 
    { 
        if (i >= m || j >= n) 
        { 
            return; 
        } 
  
        // Print First Row 
        for (int p = i; p < n; p++) 
        { 
            System.out.print(arr[i][p] + " "); 
        } 
  
        for (int p = i + 1; p < m; p++)  
        { 
            System.out.print(arr[p][n - 1] + " "); 
        } 
  
        if ((m - 1) != i)  
        { 
            for (int p = n - 2; p >= j; p--)  
            { 
                System.out.print(arr[m - 1][p] + " "); 
            } 
        } 
  
        if ((n - 1) != j)  
        { 
            for (int p = m - 2; p > i; p--)  
            { 
                System.out.print(arr[p][j] + " "); 
            } 
        } 
        print(arr, i + 1, j + 1, m - 1, n - 1); 
    }
}