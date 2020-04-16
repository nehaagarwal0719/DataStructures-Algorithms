class Tree
{
   
        int minValue(Node node)
       {
           if(node==null)
            return 0;
            
        if(node.left==null)
          return node.data;
        return minValue(node.left);
        
    }
    
}