class Gfg {
    Node rotateP (Node head, int k){
        //Write your code here
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
  
        head.prev=current;
        head = kthNode.next; 
        head.prev=null;
        kthNode.next = null; 
        
        return head;
    }
}