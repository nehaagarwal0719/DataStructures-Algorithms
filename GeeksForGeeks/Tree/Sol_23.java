class Solution {
    int res=Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
     public   int solve(TreeNode root){
        if(root==null)
         return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        
        int temp=Math.max((Math.max(l,r)+root.val),root.val);
        
          
        int ans=Math.max(temp,l+r+root.val);
         res=Math.max(res,ans);
         
         return temp;
    }
}