class Tree
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
            
            if(root==null)
             return null;
             
             
             if(x.right!=null){
                Node temp=x.right;
                while(temp.left!=null)
                  temp=temp.left;
                  return temp;     
             }
             else{
                  Node ances=root;
                  Node succ=null;
                  while(ances!=x ){
                    if(x.data<ances.data){
                        succ=ances;
                       ances=ances.left;    
                    }
                     else
                      ances=ances.right;
                   }
                    return succ;
                }
       }
       
       Node find(Node root,Node x){
           if(root.data==x.data)
             return root;
           else if(root.data>x.data)
             return find(root.left,x);
           else
             return find(root.right,x);
       }
}