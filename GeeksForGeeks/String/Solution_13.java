import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    
		    ArrayList<Character> hs=new ArrayList<Character>();
		    String s =sc.next();
		    for(int j=0;j<s.length();j++){
		        char ch=s.charAt(j);
		        if(!hs.contains(ch)){
		           hs.add(ch);
		           System.out.print(ch);
		        }     
		    }
		     System.out.println();
	}
}
}