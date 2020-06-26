class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	  if(root==null) return true;
	  
	  int lh=height(root.left);
	  int rh=height(root.right);
	  
	  if(Math.abs(lh-rh)<=1 && isBalanced(root.left) &&  isBalanced(root.right))
	   return true;
	  
	  return false; 
    }
    int height(Node node) 
    {
         
          if(node==null)
            return 0;
            
            
        return Math.max(height(node.left),height(node.right))+1;    
           
    }   
}

