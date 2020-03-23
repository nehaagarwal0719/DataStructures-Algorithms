import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    String str =sc.next();
		    char []arr = str.toCharArray(); 
            Arrays.sort(arr); 
            System.out.println(String.valueOf(arr)); 
		}   
	}
}
