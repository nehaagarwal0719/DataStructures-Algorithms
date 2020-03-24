import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  	Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int c=0;
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    for(int j=0;j<s.length();j++){
		        for(int k=j+1;k<=s.length();k++){
		              String str=s.substring(j,k);
		              if(str.charAt(str.length()-1)%2==0)
		                    c++;
		        }
		    }
           System.out.println(c);
           c=0;
		}  
		
	}
}