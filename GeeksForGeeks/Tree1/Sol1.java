class Solution {
    
    public Node deletionBT(Node root, int key){
        if(root==null)
           return null;
           
        if(root.left==null && root.right==null){
            if(root.data==key)
              return null;
            else
              return root;
        }
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        Node knode=null,temp=null;
        int x=0;
        
        while(!q.isEmpty()){
            
            temp=q.peek();
            q.remove();
            
            if(temp.data==key) 
                knode=temp;
            if(temp.left!=null)  
               q.add(temp.left);
            if(temp.right!=null)  
               q.add(temp.right);   
            
        }
        
        
        if(knode!=null){
             x=temp.data;
            delete(root,temp);
            knode.data=x;
        }    
        
        return root;
    }
    
     void delete(Node root,Node t){
         Queue<Node> q= new LinkedList<>();
          q.add(root);
          
          while(!q.isEmpty()){
            
            Node temp=q.peek();
            q.remove();
            
            if(temp==t){
                temp=null;return;
            }    
            if(temp.left!=null) {
                if(temp.left==t){
                    temp.left=null;return;
                }
                else
                  q.add(temp.left);
            } 
            if(temp.right!=null) {
                if(temp.right==t){
                    temp.right=null;return;
                }
                else
                  q.add(temp.right);
            }  
        }
     }
    
}