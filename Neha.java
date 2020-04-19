import java.util.*;
import java.lang.*;
import java.io.*;

class Try{
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

int[][] a= new int [n][n];

for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
       a[i][j]=sc.nextInt();
	}
}

int max=Integer.MIN_VALUE;
int count=0;

for(int i=1;i<=n;i++){
   
	for(int j=1;j<=n;j++){
	    int l=i,m=j;
	    
	    int sum=a[l][m];

        while(l<n && m<n){
          if(a[l+1][m]>a[l][m+1])
            sum=sum+ a[l+1][m];
          else
             sum =sum + a[l][m+1];      
        }
        if(max<sum)
         sum=max;
	}
}
System.out.println(max);
}
}