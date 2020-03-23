import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    System.out.println(s.substring(l,r+1));
		    
		}  
	}
}
