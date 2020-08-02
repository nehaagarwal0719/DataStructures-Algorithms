class Tree
{
    /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    public static void connect(Node root)
        {
            // code here.
            root.nextRight=null;
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            if(temp==null){
               if (q.peek() != null)  
                { 
                    q.add(null); 
                } 
                //continue;
            }
            else{
            temp.nextRight=q.peek();
              
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
            }      
                 
        }  
        }
}


// o(1)space

 void connectRecur(Node p)  
    { 
        // Base case 
        if (p == null) 
            return; 
   
        /* Before setting nextRight of left and right children, set nextRight 
           of children of other nodes at same level (because we can access  
           children of other nodes using p's nextRight only) */
        if (p.nextRight != null) 
            connectRecur(p.nextRight); 
   
        /* Set the nextRight pointer for p's left child */
        if (p.left != null) 
        { 
            if (p.right != null)  
            { 
                p.left.nextRight = p.right; 
                p.right.nextRight = getNextRight(p); 
            }  
            else
                p.left.nextRight = getNextRight(p); 
   
            /* Recursively call for next level nodes.  Note that we call only 
             for left child. The call for left child will call for right child */
            connectRecur(p.left); 
        } 
           
        /* If left child is NULL then first node of next level will either be 
         p->right or getNextRight(p) */
        else if (p.right != null)  
        { 
            p.right.nextRight = getNextRight(p); 
            connectRecur(p.right); 
        }  
        else
            connectRecur(getNextRight(p)); 
    } 
   
    /* This function returns the leftmost child of nodes at the same 
       level as p. This function is used to getNExt right of p's right child 
       If right child of p is NULL then this can also be used for  
       the left child */
    Node getNextRight(Node p)  
    { 
        Node temp = p.nextRight; 
   
        /* Traverse nodes at p's level and find and return 
         the first node's first child */
        while (temp != null)  
        { 
            if (temp.left != null) 
                return temp.left; 
            if (temp.right != null) 
                return temp.right; 
            temp = temp.nextRight; 
        } 
   
        // If all the nodes at p's level are leaf nodes then return NULL 
        return null; 
    } 
