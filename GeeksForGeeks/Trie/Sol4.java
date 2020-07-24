import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static final int max=26;
    
    public static class TrieNode{
		    
		    TrieNode[] children = new TrieNode[max]; 
		    boolean end;
		    //ArrayList<String> word; 
		    
		    TrieNode(){
		       end=false;
		       for(int i=0;i<max;i++)
		         children[i]=null;
		       //word=new ArrayList<>();  
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
	   // temp.word.add(key);
	}
	
	public static void search(String key){
	    
	    TrieNode temp=root;
	    String prefix="";
	    int i;
	    
	    for(i=0;i<key.length();i++){
	         prefix+=key.charAt(i);
	         
	         char lastChar = prefix.charAt(i); 
	         //System.out.println(prefix);
             TrieNode curNode = temp.children[lastChar-'a']; 
	         if(curNode==null){
	             System.out.println(0);
	            i++;
	             break;
	         }
	           
	       printWords(curNode,prefix);
	       System.out.println();
	       temp=curNode;
	       
	    } 
          for ( ; i < key.length(); i++) 
           { 
            //prefix += key.charAt(i); 
            System.out.println(0);
              //                               + prefix ); 
          } 
	       
	}
	
	public static void printWords(TrieNode temp, String prefix){
	    if(temp.end){
	           System.out.print(prefix+" ");
	    }
	   //System.out.println("hey"+prefix);
        for (char j = 'a'; j <='z'; j++) { 
            TrieNode child = temp.children[j-'a']; 
            if (child != null) 
                printWords(child,(String)prefix+j); 
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
	     // System.out.println(s);
	     insert(s);
	  }
	  
	  String s1=sc.next();
	 // System.out.println(s1);
	  search(s1);
    	 
		}
	}
}