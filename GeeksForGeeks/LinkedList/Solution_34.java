 // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             // Your code here
             
        Node slow_ptr = list.head; 
        Node fast_ptr = list.head; 
  
        if (list.head == null) 
            return ; 
  
 
        while (fast_ptr.next != list.head 
                && fast_ptr.next.next != list.head) { 
            fast_ptr = fast_ptr.next.next; 
            slow_ptr = slow_ptr.next; 
        } 
             
        /* If there are even elements in list then move fast_ptr */
        if (fast_ptr.next.next == list.head) { 
            fast_ptr = fast_ptr.next; 
        } 
        
        list.head1 =list.head;
        
        if (list.head.next !=list.head) { 
            list.head2 = slow_ptr.next; 
        }
        
        fast_ptr.next = slow_ptr.next; 
  
        /* Make first half circular */
        slow_ptr.next = list.head; 
	 }