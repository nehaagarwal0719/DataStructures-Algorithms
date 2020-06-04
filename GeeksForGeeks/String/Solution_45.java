import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	    
	  int T=sc.nextInt();
     // sc.nextLine();
	  for(int k=1;k<=T;k++){
	    int n=sc.nextInt();
	   
	     String s1=sc.next();
	      String sm=s1,lg=s1;
	    for(int i=1;i<n;i++){
	      String s=sc.next();
	      if(s.compareTo(sm)<0)
	       sm=s;
	       if(s.compareTo(lg)>0)
	       lg=s;
	    }
	    System.out.println(sm+ " "+lg);
	  }
	  
	}
}