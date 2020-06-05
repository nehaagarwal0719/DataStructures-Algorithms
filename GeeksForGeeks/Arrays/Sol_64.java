import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    String p=sc.next();
		    
		    char pt[]= new char[256];
		    char st[]= new char[256];
		    int j;
		    for(j=0;j<p.length();j++){
		        (pt[p.charAt(j)])++;
		        (st[s.charAt(j)])++;
		    }
		    int c=0;
		    for(j=p.length();j<s.length();j++){
		        if(Arrays.equals(pt,st))
		          c++;
		         (st[s.charAt(j)])++;
		         (st[s.charAt(j-p.length())])--;
		    }
		    if(Arrays.equals(pt,st))
		          c++;
		   System.out.println(c); 
		}     
	}
	
}