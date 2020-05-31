import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    
		    ArrayList<Character> hs=new ArrayList<Character>();
		    String s =sc.next();
		    for(int j=0;j<s.length();j++){
		        char ch=s.charAt(j);
		        if(!hs.contains(ch)){
		           hs.add(ch);
		           System.out.print(ch);
		        }     
		    }
		     System.out.println();
	}
}
}

-----------------------------------------------------------------------------------------------------------------------------------------

public static String unique(String s) 
    { 
        String str = new String(); 
        int len = s.length(); 
          
        // loop to traverse the string and 
        // check for repeating chars using 
        // IndexOf() method in Java 
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char c = s.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            if (str.indexOf(c) < 0) 
            { 
                // adding c to str if -1 is returned 
                str += c; 
            } 
        } 
          
        return str; 
    } 

    -------------------------------

    import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        //code
        
        Scanner sc = new Scanner(System.in);
        
        int T= sc.nextInt();
        sc.nextLine();
        for(int j=1;j<=T;j++){
           String s=sc.nextLine();
           
          System.out.println(check(s));
           
        }   
    }
    
    
    public static String check (String s){
         int m[]=new int[256];
          Arrays.fill(m,0);
          String res="";
           
          for(int j=0;j<s.length();j++){
               char ch=s.charAt(j);
               
               if(m[ch]==0){
                  m[ch]=1;
                  res+=ch;
               }
               
          }
          
          return res;
    }
}