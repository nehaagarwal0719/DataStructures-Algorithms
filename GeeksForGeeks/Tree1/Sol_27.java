class Tree
{
    public static void printCorner(Node root)
    {
        
        // add your code here    
         Queue<Node> q= new LinkedList<>();
         q.add(root);
    
          while(!q.isEmpty()){
            
            int n=q.size();
            for(int i=0;i<n;i++){
              Node temp=q.peek();
               q.remove();
              if(i==0 || i==n-1)
                System.out.print(temp.data+" ");
            
               
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
        }  
      }
    }  
