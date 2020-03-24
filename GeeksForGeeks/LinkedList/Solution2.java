class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
        } 
             return slow_ptr.data ; 
       
   }        
}