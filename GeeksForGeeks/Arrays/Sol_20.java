/*package whatever //do not write package name here */
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    BigInteger x = 	sc.nextBigInteger();
            BigInteger y =  sc.nextBigInteger();
            BigInteger sum= x.add(y);
		     
		   
		     BigInteger no=sum;
		     BigInteger d;
		     int c=0,c1=0;
		     while(no!=BigInteger.ZERO){
		         d=no.mod(BigInteger.TEN);
		         no=no.divide(BigInteger.TEN);
		         c1++;
		     }
		     BigInteger x1=x;
		     while(x!=BigInteger.ZERO){
		         d=no.mod(BigInteger.TEN);
		         x=x.divide(BigInteger.TEN);
		         c++;
		     }
		 
		     
		     if(c==c1)
		       System.out.println(sum);
		     else
		       System.out.println(x1);
		 
		     
		     
		}
	}
}