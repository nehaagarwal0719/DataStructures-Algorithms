import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int c=0;
		for(int i=1;i<=T;i++){
		    String s =sc.next();
		    char ch[]=s.toCharArray();
		    Arrays.sort(ch);
		    c=0;
		    for(int j=0;j<ch.length-1;j++){
		        if(ch[j]==ch[j+1])
		          c++;
		    }
		    System.out.println(c);
		}   
	}
}