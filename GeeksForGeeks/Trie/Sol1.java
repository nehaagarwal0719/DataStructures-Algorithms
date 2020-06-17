import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static final int max=26;
    
    public static class TrieNode{
		    
		    TrieNode[] children = new TrieNode[max]; 
		    boolean end;
		    
		    TrieNode(){
		       end=false;
		       for(int i=0;i<max;i++)
		         children[i]=null;
		    }   
		          
	};
	
	static TrieNode root; 
	
	public static void insert(String key){
	    
	    TrieNode temp=root;
	    
	    for(int i=0;i<key.length();i++){
	        int index=key.charAt(i)-'a';
	        if(temp.children[index]==null)
	            temp.children[index]=new TrieNode();
	            
	        temp=temp.children[index];
	    }
	    temp.end=true;
	
	}
	
	public static boolean search(String key){
	    
	    TrieNode temp=root;
	    
	    for(int i=0;i<key.length();i++){
	        if(temp.children[key.charAt(i)-'a']==null)
	            return false;
	        temp=temp.children[key.charAt(i)-'a'] ;
	    }
	     return (temp.end && temp!=null);
	       
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
	  //System.out.println(s1);
	  if(search(s1)==true)
	   System.out.println(1);
	  else
	   System.out.println(0);
		}
	}
}