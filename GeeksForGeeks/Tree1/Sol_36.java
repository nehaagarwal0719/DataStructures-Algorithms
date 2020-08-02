class GfG{
    public int minLeafSum(Node root){
        //Your Code Here.
        int c=1,sum=0;
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            if(temp==null){
                c++;
                if(sum!=0) return sum;
               if (q.peek() != null)  
                { 
                    q.add(null); 
                } 
                //continue;
            }
            else{
            if(temp.left==null && temp.right==null)
              sum+=temp.data;
              
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
            }      
                 
        }  
        
        return 0;
    }
}