import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int a=sc.nextInt();
	        int b=sc.nextInt();
	        int flag=1,j;
	        String res="";
		 
		 for(j=a;j<=b;j++){
		      if(check(j))
		       res+=j+" ";
		 }
		  System.out.println(res);
		}
	}
	
	public static boolean check(int j){
	    HashSet<Integer> hs = new HashSet<>();
		   while(j!=0){
		      int d=j%10;
               if(hs.contains(d))
		           return false;
		         else
		          hs.add(d);
		         j=j/10;    
		     }
		     return true;
	}
}