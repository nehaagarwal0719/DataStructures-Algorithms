import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	 	int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    
		    //HashSet<Character> hs = new HashSet<Character>();
		    int ind[]=new int[256];
		    Arrays.fill(ind,-1);
		    
		    int min=Integer.MIN_VALUE,c=0,flag=0;
		    
		    for(int j=0;j<s.length();j++){
		        if(ind[s.charAt(j)]==-1){
		          ind[s.charAt(j)]=j;
		        }    
		        else{
		            if(j-ind[s.charAt(j)]>min)
		             min=j-ind[s.charAt(j)];
		           
		             flag=1;
		        }
		    }
		    if(flag==0)
		    System.out.println("-1");
		    else
		    System.out.println(min-1);
		}   
	}
}