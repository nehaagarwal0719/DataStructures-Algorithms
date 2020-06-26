class Level_order_traversal
{
    
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> al = new ArrayList();
        
        Queue<Node> q= new LinkedList<>();
         q.add(root);
          
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            al.add(temp.data);
            
  
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
        }  
     return al;    
    }
}


-----------------

//If $ after every level
class Level_Order_Traverse
{
    static void levelOrder(Node root) 
    {
        StringBuilder res=new StringBuilder();
        if(root==null)
         return;
        
        Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
          
          while(q.size()!=1){
            
            Node temp=q.remove();
            if(temp==null){
                res.append("$"+" ");
                q.add(null);
                continue;
            }
            else
              res.append(temp.data+" ");
        
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                q.add(temp.right);
             
            //q.add(null);
        }  
      System.out.print(res+"$");
    }
}

