import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static final int max=26;
    
    public static class TrieNode{
		    
		    TrieNode[] children = new TrieNode[max]; 
		    boolean end;
		    ArrayList<String> word; 
		    
		    TrieNode(){
		       end=false;
		       for(int i=0;i<max;i++)
		         children[i]=null;
		       word=new ArrayList<>();  
		    }   
		          
	};
	
	static TrieNode root; 
	
	public static void insert(String key){
	    
	    TrieNode temp=root;
	    
	    for(int i=0;i<key.length();i++){
	        if(Character.isUpperCase(key.charAt(i))){
	            int index=key.charAt(i)-'A';
	            if(temp.children[index]==null)
	                temp.children[index]=new TrieNode();
	            
	            temp=temp.children[index];
	       }
	    }    
	    
	    temp.end=true;
	    temp.word.add(key);
	}
	
	public static boolean search(String key){
	    
	    TrieNode temp=root;
	    
	    for(int i=0;i<key.length();i++){
	        if(temp.children[key.charAt(i)-'A']==null)
	            return false;
	        temp=temp.children[key.charAt(i)-'A'] ;
	    }
	     
	       printWords(temp);
	       return true;
	       
	}
	
	public static void printWords(TrieNode temp){
	    if(temp.end){
	        for(int i=0;i<temp.word.size();i++)
	           System.out.print(temp.word.get(i)+" ");
	    }
	    
	    //System.out.println();
	   
        for (int j = 0; j < max; j++) { 
            TrieNode child = temp.children[j]; 
            if (child != null) 
                printWords(child); 
        } 
	}
	
		    
	public static void main (String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  int T=sc.nextInt(),i;
	
	  for(int x=1;x<=T;x++){
	  
	      int n=sc.nextInt();
	   
	  root=new TrieNode();
	  
	  for(i=0;i<n;i++){
	      String s=sc.next();
	      
	     insert(s);
	  }
	  
	  String s1=sc.next();
	  if(!search(s1))
	   System.out.println("No match found");
	  else
	    System.out.println();
	 
		}
	}
}