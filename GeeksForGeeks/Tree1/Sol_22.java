
class Tree{
    public void toSumTree(Node node){
        int ls, rs; 
   
        
        if (node == null)  return;
        
        if (node.left == null && node.right == null) 
            node.data=0;
   
        
        ls = sum(node.left); 
        rs = sum(node.right); 
        
        node.data=ls+rs;
        
         toSumTree(node.left); 
         toSumTree(node.right);
        
    }
    
    int sum(Node node)  
    { 
        if (node == null) 
            return 0; 
        return sum(node.left) + node.data + sum(node.right); 
    } 