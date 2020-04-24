/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    String s1 =sc.next();
		    String s2=s1.replaceAll("ac","");
		    String s3= s2.replaceAll("b","");
		    
		    System.out.println(s3);
		}    
	}
}
//without using replace method
int n = str.length;  
    
    int i = -1;  // previous character  
    int j = 0;   // current character  
    
    while (j < n)  
    {  
        /* check if current and next character forms ac */
        if (j < n-1 && str[j] == 'a' && str[j+1] == 'c')  
            j += 2;  
    
        /* if current character is b */
        else if (str[j] == 'b')  
            j++;  
    
        /* if current char is 'c && last char in output  
           is 'a' so delete both */
        else if (i >= 0 && str[j] == 'c' && str[i] == 'a')  { 
            i--; 
            j++;  
        }
    
        /* else copy curr char to output string */
        else
            str[++i] = str[j++];  
              
    }  
 System.out.println(new String(str).substring(0,i+1)); 
