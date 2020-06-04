import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
	 Scanner sc = new Scanner(System.in);
	  
	  int T=sc.nextInt();
	  
	  for(int k=1;k<=T;k++){
	   
	          int a=sc.nextInt();
	          int c=0;
	          while(a>0){
	              int d=a%2;
	              if(d==1)
	                break;
	              c++;     
	              a=a/2;
	          }
	          System.out.println(c);
	      
	  }  
	}
}