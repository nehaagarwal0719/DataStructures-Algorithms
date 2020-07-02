class Solution
{
    // Return the Kth smallest element in the given BST 
      int ans=-1,c=0;
    public int KthSmallestElement(Node node, int K) 
    {
        // Write your code here
      
         solve(node,K);
        return ans;
        
        
    }
    
    public void solve(Node node,int k){
        
      if(node==null)
       return;
       
      solve(node.left, k);  
          
      c++; 
    
      if (c == k){ 
            ans= node.data; 
            return;
      }
      
      solve(node.right, k);  
      
     
    }
    
}

