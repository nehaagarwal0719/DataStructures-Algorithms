class Sol
{
    public  Node insertToAVL(Node node,int key)
    {
        
        if (node == null) 
            return (new Node(key)); 
  
        if (key < node.data) 
            node.left = insertToAVL(node.left, key); 
        else if (key > node.data) 
            node.right = insertToAVL(node.right, key); 
        else 
            return node; 
  
        /* 2. Update height of this ancestor node */
        node.height = 1 + Math.max(height(node.left), 
                              height(node.right)); 
  
        /* 3. Get the balance factor of this ancestor 
              node to check whether this node became 
              unbalanced */
        int balance = getBalance(node); 
  
        // If this node becomes unbalanced, then there 
        // are 4 cases Left Left Case 
        if (balance > 1 && key < node.left.data) 
            return rightRotate(node); 
  
        // Right Right Case 
        if (balance < -1 && key > node.right.data) 
            return leftRotate(node); 
  
        // Left Right Case 
        if (balance > 1 && key > node.left.data) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        // Right Left Case 
        if (balance < -1 && key < node.right.data) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        /* return the (unchanged) node pointer */
        return node;
    }
    Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 
  
        // Perform rotation 
        x.right = y; 
        y.left = T2; 
  
        // Update heights 
        y.height = Math.max(height(y.left), height(y.right)) + 1; 
        x.height = Math.max(height(x.left), height(x.right)) + 1; 
  
        // Return new root 
        return x; 
    } 
  
    // A utility function to left rotate subtree rooted with x 
    // See the diagram given above. 
    Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 
  
        
        y.left = x; 
        x.right = T2; 
  
        
        x.height = Math.max(height(x.left), height(x.right)) + 1; 
        y.height = Math.max(height(y.left), height(y.right)) + 1; 
  
    
        return y; 
    } 
    
    int height(Node N) { 
        if (N == null) 
            return 0; 
  
        return N.height; 
    } 
    
     int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
    }
 
    
}    