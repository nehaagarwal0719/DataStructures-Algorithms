
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    String res="";
		    
		    for(int j=0;j<s.length()-1;j++){
		        if(s.charAt(j)!=s.charAt(j+1))
		           res+=s.charAt(j);
		    }
		    System.out.println(res+s.charAt(s.length()-1));
		}    
	}
}