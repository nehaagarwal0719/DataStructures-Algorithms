int height(Node root) 
    {
         
          if(node==null)
            return 0;
            
            
        return Math.max(height(node.left),height(node.right))+1;    
           
    }  