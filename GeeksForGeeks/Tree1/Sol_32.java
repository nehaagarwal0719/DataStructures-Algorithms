class Solution
{
    /* Returns level of given data value */
    int getLevel(Node root, int data)  
    { 
        // Write your code here
        int c=1;
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            if(temp==null){
                c++;
               if (q.peek() != null)  
                { 
                    q.add(null); 
                } 
                //continue;
            }
            else{
            if(temp.data==data)
              return c;
              
            if(temp.left!=null) 
               q.add(temp.left);
            
            if(temp.right!=null) 
                  q.add(temp.right);
            }      
                 
        }  
        
        return 0;
    } 
    

}