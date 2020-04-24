import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   	Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		sc.nextLine();
	
		for(int i=1;i<=T;i++){
		    String s=sc.nextLine();
		    s=s.replaceAll("\\s", "");
		    String reverse = new StringBuffer(s).reverse().toString();
		    if(s.equals(reverse))
		      System.out.println("YES");
		    else
		       System.out.println("NO");
		}    
	}
}