import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
	    Scanner sc = new Scanner(System.in);
	 	int T= sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		  
        HashMap<String,Integer> hs = new HashMap<String,Integer>();  
        int j=0,f=0;;
        
        for(j=0;j<n;j++){
          
          String s=sc.next();
          if(hs.containsKey(s))
            hs.put(s,hs.get(s)+1);	
          else
            hs.put(s,1);
        }
        
        int maxValue = 0; 
        String winner = ""; 
        for (Map.Entry<String,Integer> entry : hs.entrySet()) 
        { 
            String key  = entry.getKey(); 
            Integer val = entry.getValue(); 
            if (val > maxValue) 
            { 
                maxValue = val; 
                winner = key; 
            } 
  
            else if (val == maxValue && 
                winner.compareTo(key) > 0) 
                winner = key; 
        } 
        System.out.println(winner +" "+maxValue); 
	 }    
	}
}