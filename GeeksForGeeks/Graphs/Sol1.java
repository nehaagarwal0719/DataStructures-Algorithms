import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		     System.out.println(doit(n));
		}   
		
       }
       
       static int doit(int n){

            if (n<2) return 0;
            if (n==2) return 1;
            return (n%3)+1+doit(n/3);
	}
}