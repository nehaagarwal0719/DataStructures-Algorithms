class Tree
{
	boolean v1,v2; 
/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
         v1 = false; 
        v2 = false; 
  
        // Find lca of n1 and n2 using the technique discussed above 
        Node lca = LCAUtil(root, n1, n2); 
  
        // Return LCA only if both n1 and n2 are present in tree 
        if (v1 && v2) 
            return lca; 
  
        // Else return NULL 
        return null; 
	}
	
	Node LCAUtil(Node root, int n1, int n2){
	    if(root==null) return null;
	    
	    Node temp=null;
	    
	    if(root.data==n1) {
	        v1=true;temp=root;
	    }
	    
	    if(root.data==n2) {
	        v2=true;temp=root;
	    }
	    
	    Node left= LCAUtil(root.left, n1, n2);
	    Node right= LCAUtil(root.right, n1, n2);
	    
	    if(temp!=null) return temp;
	    
	   
	    
	    if(left!=null && right!=null) return root;
	    
	    return (left != null) ? left : right;
	    
	}
}

