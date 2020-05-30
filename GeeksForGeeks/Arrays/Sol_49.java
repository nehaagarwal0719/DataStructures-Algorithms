import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		 Arrays.sort(a);
		 int cut=a[0],min=0;
		 String res="";
		 for(j=1;j<n;j++){
		     if(a[j]-cut>0){
		       res+=n-j + " ";
		       cut=a[j];
		       
		       min++;
		     }
		 }
		 
		 if(min==0)
		   System.out.println(0);
		 else
		   System.out.println(res);
		}	 
	}
}