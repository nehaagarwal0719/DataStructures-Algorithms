
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
		    System.out.println(res(n));
		}
	}
	
	static String res(int n){
	      if (n == 1)     return "1"; 
          if (n == 2)     return "11"; 
          
          String str = "11";  
           
          for (int i = 3; i <= n; i++) 
            { 
              str+='$';
              int c=1;
              String temp="";
              for (int j = 1; j < str.length(); j++) 
                {
                    if(str.charAt(j)!=str.charAt(j-1)){
                        temp+=c+0;
                        temp+=str.charAt(j-1);
                        c=1;
                    }
                    else
                     c++;
                }   
                str=temp;
            }
             return str;
	}       
}