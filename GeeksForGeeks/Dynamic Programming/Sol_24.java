import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int test=Integer.parseInt(br.readLine());
	while(test>0)
	{
	    int n=Integer.parseInt(br.readLine().trim());
	    BigInteger arr[]=new BigInteger[n+1];
	    arr[0]=BigInteger.valueOf(1);
	    arr[1]=BigInteger.valueOf(1);
	    for(int a=2;a<=n;a++)
	    {
	        arr[a]=BigInteger.valueOf(0);
	        for(int b=0;b<a;b++)
	        {
	            BigInteger hell=arr[b].multiply(arr[a-b-1]);
	            arr[a]=arr[a].add(hell);
	            
	        }
	        //System.out.println(arr[a]);
	    }
	    System.out.println(arr[n]);
	    test--;
	   
	    
	}
	}
}