import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int k=0;k<T;k++){
		    int n=sc.nextInt();
		    long a=0,b=1,c=0;
		    if(n==1)
		     System.out.println(1);
		    else{ 
		    for(int i=2;i<=n;i++){
		        c=(a+b)%1000000007; ////IMP
		        a=b;
		        b=c;
		    }
		    System.out.println(c);
		    }
		}
	}
}