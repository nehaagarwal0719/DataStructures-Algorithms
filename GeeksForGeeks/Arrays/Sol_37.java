import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		  
		 int a[] = new int[n];
		 int s=0,p=0;;
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		      s=s+a[j];
		     if(s<0){
		     
		      p=p-s;
		      s=s+p;
		     }    
		 } 
		 
		 System.out.println(p+1);
	}
}
}