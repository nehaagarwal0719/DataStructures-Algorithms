
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int c=0;
		for(int i=1;i<=T;i++){
		    
		    HashSet<Character> hs=new HashSet<Character>();
		    String s =sc.next();
		    c=0;
		    for(int j=0;j<s.length();j++){
		        char ch=s.charAt(j);
		        if(hs.contains(ch)){
		            c=1;
		            System.out.println(ch);
		            break;
		        }
		        else
		          hs.add(ch);
		    }
		    hs.clear();
		    if(c==0)
		     System.out.println(-1);
		} 
	}
}