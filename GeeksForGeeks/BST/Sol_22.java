class Solution{
    
    // modify the BST and return its root
    int sum=0;
    public Node modify(Node root)
    {
        //Write your code here
        int s=0;
        //Node temp=root;
        solve(root);
        return root;
    }
    
    public void solve(Node root){
        if(root==null)
          return;
        
        solve(root.right);
        
          sum+=root.data;
          root.data=sum;

        solve(root.left);
       
       
    }
    
}
