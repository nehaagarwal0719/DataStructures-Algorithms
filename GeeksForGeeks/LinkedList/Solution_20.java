sdclass GfG
{
    public static Node reverse(Node node, int k)
    {
        
       Node current = node; 
       Node next = null; 
       Node prev = null; 
         
       int count = 0; 
  
       /* Reverse first k nodes of linked list */
       while (count < k && current != null)  
       { 
           next = current.next; 
           current.next = prev; 
           prev = current; 
           current = next; 
           count++; 
       } 
       
        if (next != null)  
          node.next = reverse(next, k); 
       
       return prev;
       
    }
}