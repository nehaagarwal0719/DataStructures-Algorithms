
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    
		for(int j=1;j<=T;j++){
		   String s=sc.next();
		   String s1=sc.next();
		   
		   if(check(s,s1))
		    System.out.println(1);
		   else
		    System.out.println(0);
		   
		}   
	}
	
static boolean check(String str1, String str2) 
    { 
        int m = str1.length(); 
        int n = str2.length(); 
          

        if(m != n) 
            return false; 
              
    
        Boolean[] marked = new Boolean[256]; 
        Arrays.fill(marked, Boolean.FALSE); 
          
        int[] map = new int[256]; 
        Arrays.fill(map, -1); 
          
    
        for (int i = 0; i < n; i++) 
        { 
             
            if (map[str1.charAt(i)] == -1) 
            { 
                 
               if (marked[str2.charAt(i)] == true) 
                    return false; 
  
            
                marked[str2.charAt(i)] = true; 
  
        
                map[str1.charAt(i)] = str2.charAt(i); 
            } 
  
          
            else if (map[str1.charAt(i)] != str2.charAt(i)) 
            return false; 
        } 
  
        return true; 
    } 
}