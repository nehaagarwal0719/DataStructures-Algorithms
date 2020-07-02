class Tree
{
   
      eint ans=1,c=0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node node,int k)
    {
        solve(node,k);
        return ans;
    }
    
    public void solve(Node node,int k){
        
      if(node==null)
       return;
       
      solve(node.right, k);  
          
      c++; 
    
      if (c == k){ 
            ans= node.data; 
            return;
      }
      
      solve(node.left, k);  
      
     
    }
    
}