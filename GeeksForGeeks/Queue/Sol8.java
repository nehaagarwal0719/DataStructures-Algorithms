import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 Queue<String> q= new LinkedList<String>();
		 String res="";
		 q.add("1");
		 while(n!=0){
		     String s=q.peek();
		     q.remove();
		     res+=s+" ";
		     q.add(s+'0');
		     q.add(s+'1');
	         n--;
		 }
		 System.out.println(res);
		}
	}
}