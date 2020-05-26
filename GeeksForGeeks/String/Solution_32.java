import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    String s;
		for(int j=1;j<=T;j++){
		    s=sc.next();
		    char ch = sc.next().charAt(0);
		    int c=sc.nextInt();
		    if(c==0)
		      System.out.println(s);
		   else{    
		    int index=-1;
		    //System.out.println(s+" "+c+" "+ch);
		for(int k=0;k<s.length();k++){
		    if(s.charAt(k)==ch)
		      --c;
		     if(c==0){
		     index=k;break;
		     }
		}
		//System.out.println(index);
		if(index>=0 && index<=s.length()-2)
		 System.out.println(s.substring(index+1,s.length()));
		else
		 System.out.println("Empty string");
		   }
	  }  
	}
}