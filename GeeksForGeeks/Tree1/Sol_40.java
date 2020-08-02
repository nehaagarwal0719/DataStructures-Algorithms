class GfG
{
    
    public static boolean printAncestors(Node node, int target)
    {
        // add your code here
        if (node == null) 
            return false; 
   
        if (node.data == target) 
            return true; 
   
        /* If target is present in either left or right subtree  
           of this node, then print this node */
        if (printAncestors(node.left, target) 
                || printAncestors(node.right, target))  
        { 
            System.out.print(node.data + " "); 
            return true; 
        } 
   
        /* Else return false */
        return false; 
    }
}