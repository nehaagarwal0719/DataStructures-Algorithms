	public static Node insert(Node root,int value) {
     if(root==null)
        {
     Node node=new Node(value);
     node.left=null;
     node.right=null;
     root=node;
         }
    else if(root.data>value)
      root.left=insert(root.left,value);
    else if(root.data<value)
      root.right=insert(root.right,value);

   return root;
}
