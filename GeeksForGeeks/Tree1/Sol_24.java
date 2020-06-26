class GfG
{

	boolean isFullTree(Node node) 
    { 
        if(node == null) 
        return true; 
           
        if(node.left == null && node.right == null ) 
            return true; 
           
        
        if((node.left!=null) && (node.right!=null)) 
            return (isFullTree(node.left) && isFullTree(node.right)); 
           
     
        return false; 
    } 
}