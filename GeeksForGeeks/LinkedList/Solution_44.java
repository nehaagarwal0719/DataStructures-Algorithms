class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        if (k == 0) return head; 
  

        Node current  = head; 
  

        int count = 1; 
        while (count < k && current !=  null) 
        { 
            current = current.next; 
            count++; 
        } 
  
 
        if (current == null) 
            return head; 
  
     
        Node kthNode = current; 
  
  
        while (current.next != null) 
            current = current.next; 
  
    
        current.next = head; 
  
      
        head = kthNode.next; 
  
        kthNode.next = null; 
        
        return head;
    }
}
