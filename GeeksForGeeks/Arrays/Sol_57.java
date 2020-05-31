import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		    int c=sc.nextInt();
		    int count=1;
		 
		    while(c-count>=0){
		        c=c-count;
		        count++;
		        if(count==n+1){
		         count=0;
		        }
		        
		    }
		  System.out.println(c);  
		}   
	}
}