class Tree
{
	public void reversePrint(Node root) 
        {
        Stack<Integer> st = new Stack<>();
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
          
          while(!q.isEmpty()){
            
            Node temp=q.remove();
            st.push(temp.data);
            
            if(temp.right!=null) 
                  q.add(temp.right);
                  
            if(temp.left!=null) 
               q.add(temp.left);
        }  
        
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}      
       
