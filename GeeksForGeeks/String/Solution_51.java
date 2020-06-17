import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  int T=sc.nextInt();
	  
	  for(int k=1;k<=T;k++){
	     String s=sc.next();
	     char a[]=s.toCharArray();
	     HashSet<Character> hs = new HashSet<>();
	     int i;
	     
	     for(i=0;i<a.length;i++){
	         hs.add(a[i]);
	     }
	     
	     int l=0,r=0,min=Integer.MAX_VALUE;
	     HashMap<Character,Integer> hs1 = new HashMap<>();
	     while(l<a.length && r<a.length){
	         if(!hs1.containsKey(a[r]))
	            hs1.put(a[r],1);
	         else 
	            hs1.put(a[r],hs1.get(a[r])+1);
	          r++;
	         
	         if(hs.size()==hs1.size()){
	             //System.out.println("ok"+ r+ " "+l); 
	             min=Math.min(min,r-l);
	             // System.out.println(min);
	             while(hs1.size()==hs.size() && l<a.length){
	                if(hs1.containsKey(a[l]) && hs1.get(a[l])>1)
	                  hs1.put(a[l],hs1.get(a[l])-1);
	                else  
	                   hs1.remove(a[l]);
	                l++;
	             }    
	             min=Math.min(min,r-l+1);
	         }
	         //System.out.println(min); 
	     }
	     System.out.println(min);
	  }  
	}
}