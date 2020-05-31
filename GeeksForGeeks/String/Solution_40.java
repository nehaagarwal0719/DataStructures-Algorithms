
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
        
        int T= sc.nextInt();
        //sc.nextLine();
        for(int j=1;j<=T;j++){
           String s=sc.next();
           String s1=sc.next();
           
           HashSet<Character> hs = new HashSet<>();
           
           for(int i=0;i<s.length();i++){
               hs.add(s.charAt(i));
           }
           int f=0;
           for(int l=0;l<s1.length();l++){
               if(hs.contains(s1.charAt(l))){
                  f++;
                 break;
               } 
           }
           
           if(f==0)
             System.out.println(0);
           else
             System.out.println(1);
        }   
	}
}