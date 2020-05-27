import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	 
	 
	  Scanner sc = new Scanner(System.in);
	    
	  int T=sc.nextInt();
		sc.nextLine();
	  for(int i=1;i<=T;i++){
	    String s=sc.nextLine();
	    LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();  
	  
	    for (String val: s.split(" ")) {
	        if(!hm.containsKey(val))
	           hm.put(val,1);
	       else
	           hm.put(val,hm.get(val)+1);
	     }       

	     int maxValue = 0; 
        String winner = ""; 
        for (Map.Entry<String,Integer> entry : hm.entrySet()) 
        { 
            String key  = entry.getKey(); 
            Integer val = entry.getValue(); 
            if (val > maxValue) 
            { 
                maxValue = val; 
                winner = key; 
            } 
  
           // else if (val == maxValue && 
             //   winner.compareTo(key) > 0) 
               // winner = key; 
        } 
        System.out.println(winner +" "+maxValue); 
        
	   }
     }  
}