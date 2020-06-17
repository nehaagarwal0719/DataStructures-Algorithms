class GfG
{   
    public static final int max=2;
    
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
	
	public static void insert(int key[]){
	    
	    TrieNode temp=root;
	    
	    for(int i=0;i<key.length;i++){
	        int index=key[i];
	        if(temp.children[index]==null)
	            temp.children[index]=new TrieNode();
	            
	        temp=temp.children[index];
	    }
	    temp.end=true;
	}
	
	 public static boolean search(int key[]){
	    
	    TrieNode temp=root;
	    for(int i=0;i<key.length;i++){
	        if(temp.children[key[i]]==null)
	            return false;
	        temp=temp.children[key[i]] ;
	    }
	     if (temp.end && temp!=null)
	       return true;
	     
	     return false;
	}
    public static void printMat(int a[][],int r, int c)
    {
    
        root=new TrieNode();
        int i;
        String res="";
        for(i=0;i<r;i++){
           if(!search(a[i])){
              for(int j=0;j<c;j++)
                res+=a[i][j]+" ";
              res+='$';    
             insert(a[i]);
           }
        }
        
        
       System.out.print(res); 
    }
}