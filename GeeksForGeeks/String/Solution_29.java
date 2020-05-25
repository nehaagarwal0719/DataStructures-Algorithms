import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    String s;
		for(int j=1;j<=T;j++){
		    int n=sc.nextInt();
		    s=sc.next();
		    
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();  
        int f=0,i;
        
		for (i=0;i<s.length();i++){
		    if(!hs.containsKey(s.charAt(i)))
		      hs.put(s.charAt(i),1);
		    else{
		       hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
		    }
		}
	   	for (i=0;i<s.length();i++){
	   	   // System.out.println(s.charAt(i));
	   	    if(hs.get(s.charAt(i))==1){
	   	        System.out.println(s.charAt(i));
	   	        f=1;
	   	        break;
	   	    }
	   	}   
	   
	   if(f==0)
	    System.out.println(-1);
		
		}
	}
}