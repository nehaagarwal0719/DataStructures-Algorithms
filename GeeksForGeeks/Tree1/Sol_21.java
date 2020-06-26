class Tree
{
	boolean isSumTree(Node node)
	{
        int ls, rs; 
   
        
        if ((node == null) || (node.left == null && node.right == null)) 
            return true; 
   
        
        ls = sum(node.left); 
        rs = sum(node.right); 
   
        if ((node.data == ls + rs) && isSumTree(node.left) 
                && isSumTree(node.right)) 
            return true; 
   
        return false; 
	}
	
	int sum(Node node)  
    { 
        if (node == null) 
            return 0; 
        return sum(node.left) + node.data + sum(node.right); 
    } 
}
