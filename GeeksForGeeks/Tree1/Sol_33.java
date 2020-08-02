class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
      int c=0;int count=0,max=0,ans=0;
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            if(temp==null){
              
               
                if(count>max){
                    ans=c;
                    max=count;
                }
                count=0;
               if (q.peek() != null)  
                { 
                    q.add(null); 
                } 
                 c++;
            }
            else{
                count++;
                
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
            }      
                 
        }  
        
        return ans;   
    }
}