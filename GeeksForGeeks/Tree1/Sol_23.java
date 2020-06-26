class GfG {
    public int maxLevelSum(Node root) {
        if(root==null)
         return 0;
        
        Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
         int s=0,max=Integer.MIN_VALUE;
         
          while(q.size()!=1){
            
            Node temp=q.remove();
            if(temp==null){
                max=Math.max(max,s);
                s=0;
                q.add(null);
                continue;
            }
            else
              s+=temp.data;
        
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                q.add(temp.right);
             
            //q.add(null);
        }  
        max=Math.max(max,s);
      return max;
    }
}