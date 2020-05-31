import java.util.*;
import java.lang.*;
import java.io.*;
  
class GFG {
    
    public static  ArrayList<String> al= new ArrayList<>();
     
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
        
        int T= sc.nextInt();
        
        for(int j=1;j<=T;j++){
           String s=sc.next();
           
           al.clear();
           permute(s,0,s.length()-1);
          
           Collections.sort(al);
           for(int k=0;k<al.size();k++)
             System.out.print(al.get(k)+ " ");
           System.out.println();
        }   
	}
	
	public static void permute(String s, int l, int r){
	 
	    if(l==r)
	     al.add(s);
	     
	    else{
	        for(int i=l;i<=r;i++){
	            s=swap(s,l,i);
	            permute(s,l+1,r);
	            s=swap(s,l,i);
	        }
	    } 
	   
	}
	
	public static String swap(String s, int i, int j ){
	    char temp; 
        char[] charArray = s.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}
}