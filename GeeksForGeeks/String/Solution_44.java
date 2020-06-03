import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	  int T=sc.nextInt();
      sc.nextLine();
	  for(int k=1;k<=T;k++){
	    String s=sc.nextLine();
	    String res="";
	    HashSet<Character> hs = new HashSet<>();
	    
	    for(int i=0;i<s.length();i++){
	      if(!hs.contains(Character.toLowerCase(s.charAt(i)))){
	         hs.add(Character.toLowerCase(s.charAt(i)));
	         res+=s.charAt(i);
	      }
	      else{
	          hs.remove(Character.toLowerCase(s.charAt(i)));
	      }
	      
	    }
	    System.out.println(res);
	  } 
	}
}