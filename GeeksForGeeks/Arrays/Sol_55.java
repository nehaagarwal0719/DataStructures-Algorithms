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
		    
		    int res[] = new int[10000]; 
            res[0]=1;
            int res_size=1;
            
            for(int j=2;j<=n;j++)
              res_size=multiply(res,j,res_size);
		    
		    for(int k=res_size-1;k>=0;k--)
		      System.out.print(res[k]);
		    
		    System.out.println();     
		    
		}   
	}
	
	public static int multiply(int res[], int n, int res_size){
	    
	    int carry=0;
	    
	    for(int i=0;i<res_size;i++){
	        int prod=res[i]*n +carry;
	        res[i]=prod%10;
	        carry=prod/10;
	    }
	    while(carry!=0){
	        res[res_size]=carry%10;
	        carry=carry/10;
	        res_size++;
	    }
	    
	    return res_size;
	}
}