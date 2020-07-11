
class Solution
{
    // Return the minimum absolute difference between any tree node and the integer K
    static int maxDiff(Node  root, int K) 
    { 
        
        if(root==null) return Integer.MAX_VALUE;
        
        
         if(root.data<=K )
             return Math.min(maxDiff(root.right,K),Math.abs(K-root.data));
    
         else 
            return Math.min(maxDiff(root.left,K),Math.abs(K-root.data));
    
    } 
}

