class Tree
{
    int max=0;
    void leftView(Node root)
    {
      
      if(root==null)
      return;
      
      solve(root,1);
    }
    
    void solve(Node root, int level){
        
        if(root==null)
         return;
         
        if(level>max){
         System.out.print(root.data+" ");
         max=level;
        }
         
         solve(root.left,level+1);
         solve(root.right,level+1);
    }
}