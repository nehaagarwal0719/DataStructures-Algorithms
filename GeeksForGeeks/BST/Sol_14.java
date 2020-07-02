 boolean isBST(Node root)
        {
            return BST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
    boolean BST(Node root, int min, int max){
        if(root==null)
          return true;
          
        if(root.data<min || root.data>max)
          return false;
          
        return ((BST(root.left,min,root.data-1)) &&  (BST(root.right,root.data+1,max)));
        
    }