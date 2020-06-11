class GfG
{
    int countNodes(Node root)  
    { 
        if (root == null) 
            return 0; 
        return 1 + countNodes(root.left) + countNodes(root.right); 
    } 
    
    boolean complete(Node root, int index, int total){
        if(root == null) 
            return true; 
          
        if(index >= total) 
            return false; 
          
        
        return complete (root.left, 2*index+1, total) &&  
               complete (root.right, 2*index+2, total); 
    }
    
    
    boolean isHeap(Node tree)
    {
	 
	   int total=countNodes(tree);
	
	   if(complete(tree,0,total) && check(tree))
	     return true;
	 return false;
    }
    
    boolean check(Node tree){
        
        if(tree.left==null && tree.right==null)
	     return true;
	   
	   if(tree.right==null){
	       return tree.data>=tree.right.data;
	   }
	   
	   
	   if(tree.left.data<=tree.data && tree.right.data<=tree.data)
	     return isHeap(tree.left) && isHeap(tree.right);
	    else
	      return false;
    }
}