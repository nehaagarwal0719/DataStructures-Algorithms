class Merge
{
    Node mergeKList(Node[]a,int N)
    {
        //Add your code here.
        Node head=null, prev=null;
        PriorityQueue<Node> pq  = new PriorityQueue<>( 
                new Comparator<Node>() { 
                    public int compare(Node a, Node b) 
                    { 
                        return a.data - b.data; 
                    } 
                }); 
                
        
        for(int i=0;i<N;i++){
            if(a[i]!=null)
              pq.add(a[i]);
        }    
        
        while (!pq.isEmpty()) { 
            // get the top element of 'pq' 
            Node top = pq.peek(); 
            pq.remove(); 
  
            // check if there is a node 
            // next to the 'top' node 
            // in the list of which 'top' 
            // node is a member 
            if (top.next != null) 
                // push the next node in 'pq' 
                pq.add(top.next); 
  
            // if final merged list is empty 
            if (head == null) { 
                head = top; 
                // points to the last node so far of 
                // the final merged list 
                prev = top; 
            } 
            else { 
                // insert 'top' at the end 
                // of the merged list so far 
                prev.next = top; 
  
                // update the 'last' pointer 
                prev = top; 
            } 
            
        } 
        
        return head;
    }
}
