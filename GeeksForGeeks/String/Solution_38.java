import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    
		for(int j=1;j<=T;j++){
		   String str=sc.next();
		 char s[]=str.toCharArray();
		int n=s.length;
		int left=0,right=n-1;
		while(left<=right){
		    
		    if(!Character.isLetter(s[left])){
		        left++;
		       
		    }
		    else if(!Character.isLetter(s[right])){
		        right--;
		      
		    }
		     else{ 
		    char temp=s[left];
		    s[left]=s[right];
		    s[right]=temp;
		    left++;
		    right--;
		     }
		}
		
		System.out.println(s);
		}    
	}
}