import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int w=0;w<T;w++){
		    int n=sc.nextInt();
		    
		Queue<Character> q=new LinkedList<>();
		int[] count = new int[26]; 
		String res="";
		for(int j=0;j<n;j++){
		   char ch=sc.next().charAt(0);
		   q.add(ch);
		   count[ch-'a']++;
		   
             if(!q.isEmpty()){
	
		       while(!q.isEmpty()){
		          if(count[q.peek()-'a']>1)
		              q.remove();
		          else{
		              res+=q.peek()+" ";
		              break;
		          }    
		       }        
             }       
             
		      if(q.isEmpty())
		          res+=-1+" ";
		   }
		    System.out.println(res);
		 }    
	}
}