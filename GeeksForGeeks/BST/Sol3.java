]oclass Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int x)
	{
	    if(root==null)
	       return root;
	    else if(x<root.data)
	       root.left=deleteNode(root.left,x);
	    else if(x>root.data)
	       root.right=deleteNode(root.right,x);
	   else{
	       if(root.left==null && root.right==null){
	           root=null;
	       }
	       else if(root.left==null){
	           root=root.right;
	       }
	       else if(root.right==null){
	           root=root.left;
	       }
	       else{
	           Node temp=Fmin(root.right);
	           root.data=temp.data;
	           root.right=deleteNode(root.right,temp.data);
	       }
	   } 
	   return root;
	}
	
	public static Node Fmin(Node root){
	   if(root==null)
            return root;
            
        if(root.left==null)
          return root;
        return Fmin(root.left);
	}
}	