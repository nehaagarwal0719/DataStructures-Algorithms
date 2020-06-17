class GfG {
    int res=Integer.MIN_VALUE;
    
    public int maxPathSum(Node root) {
        // your code here
        solve(root);
        return res;
    }
    
    public   int solve(Node node){
         // Base cases 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return node.data; 

        int ls = solve(node.left); 
        int rs = solve(node.right); 
  
        
        if (node.left != null && node.right != null) { 
            int temp=Math.max(ls, rs) + node.data
           
            res = Math.max(res, ls + rs + node.data); 
  
            
            return temp; 
        } 
  
        
        return (node.left == null) ? rs + node.data 
                : ls + node.data;    
    }
}