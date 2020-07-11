class Tree{
    public  void printExtremeNode(Node root)
      {
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         boolean f=false;
          while(!q.isEmpty()){
            
            int n=q.size();
            f=!f;
            for(int i=0;i<n;i++){
              Node temp=q.peek();
               q.remove();
              if(f==false && i==0)
                System.out.print(temp.data+" ");
               if(f==true && i==n-1)
                System.out.print(temp.data+" ");
               
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
        }  
      }
      }
}