public int leftLeavesSum(Node node) 
    { 
       int res = 0; 
   
        
        if (node != null)  
        { 
            
            if (isLeaf(node.left)) 
                res += node.left.data; 
            else 
                res += leftLeavesSum(node.left); 
   
            res += leftLeavesSum(node.right); 
        } 
   
        // return result 
        return res; 
        
    } 
   public static boolean isLeaf(Node root){
       if(root==null)
       return false;
       
       if(root.left==null && root.right==null)
         return true;
        return false; 
   }