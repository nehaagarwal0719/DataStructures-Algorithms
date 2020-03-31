import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		 int T=sc.nextInt();
		int f=-1;
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    f=-1;
		for(int j=0;j<s.length();j++){
		     char ch= s.charAt(j);
		     if(s.indexOf(ch,j+1)>0){
		         System.out.println(ch);
		         f=1;
		         break;
		     }
		  }    
		  if(f==-1)
		    System.out.println(-1);
		}
	}
}