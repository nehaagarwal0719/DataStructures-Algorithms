import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s=sc.next();
            String patt=sc.next();
        
        HashSet<Character> hs = new HashSet<Character>();  
        int j=0,f=0;;
        
        for(j=0;j<patt.length();j++)
          hs.add(patt.charAt(j));
          
        for(j=0;j<s.length();j++){
          if(hs.contains(s.charAt(j))){
              System.out.println(s.charAt(j));
              f=1;
              break;
          }
        }
        
        if(f==0)
          System.out.println('$');
		}  
	}
}

