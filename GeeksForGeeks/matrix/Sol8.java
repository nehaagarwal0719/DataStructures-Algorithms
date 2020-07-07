
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int a1=1;a1<=T;a1++){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    
		    int i,j,a[][]=new int[n][m];
		    
		    for(i=0;i<n;i++){
		        for(j=0;j<m;j++)
		          a[i][j]=sc.nextInt();
		    }
		    
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    int temp=a[x][y];
		     
		    floodfill(x,y,temp,k,a,n,m);
		    
		    for(i=0;i<n;i++){
		      for(j=0;j<m;j++)
		         System.out.print(a[i][j]+" ");
		}
		 System.out.println();
		}
	}
	
	static void floodfill(int x, int y, int temp, int k,int a[][], int n,int m ){
	    if(x<0 || x>=n || y<0 || y>=m )
	      return;
	    if(a[x][y]!=temp)
	     return;
	     
	    a[x][y]=k;
	    
	    floodfill(x+1,y,temp,k,a,n,m);
	    floodfill(x-1,y,temp,k,a,n,m);
	    floodfill(x,y+1,temp,k,a,n,m);
	    floodfill(x,y-1,temp,k,a,n,m);
	    
	}
	
}