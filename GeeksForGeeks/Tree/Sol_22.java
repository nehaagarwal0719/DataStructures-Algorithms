class Tree {
    int res=Integer.MIN_VALUE;
    
     int diameter(Node root) {
        
        solve(root);
        return res;
       
    }
    
     int solve(Node root){
        if(root==null)
         return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        
        int temp=Math.max(l,r)+1;
        int ans=Math.max(temp,l+r+1);
         res=Math.max(res,ans);
         
         return temp;
    }
}