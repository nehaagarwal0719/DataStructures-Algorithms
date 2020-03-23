import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    String replaced=s.replace('6','9');
		    int diff = Math.abs(Integer.parseInt(s) - Integer.parseInt(replaced));
		    System.out.println(diff);
		}    
	}
}
