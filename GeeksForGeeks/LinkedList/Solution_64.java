class GfG
{
	public static void insert(Node head,int value,int n1)
         {
            Node current = head; 
            Node new_node= new Node(value);
  
        // Case 1 of the above algo 
        if (current == null) 
        { 
            new_node.next = new_node; 
            head = new_node; 
  
        } 
  
        // Case 2 of the above algo 
        else if (current.data >= new_node.data) 
        { 
  
            /* If value is smaller than head's value then 
             we need to change next of last node */
            while (current.next != head) 
                current = current.next; 
  
            current.next = new_node; 
            new_node.next = head; 
            head = new_node; 
        } 
  
        // Case 3 of the above algo 
        else
        { 
  
            /* Locate the node before the point of insertion */
            while (current.next != head && 
                   current.next.data < new_node.data) 
                current = current.next; 
  
            new_node.next = current.next; 
            current.next = new_node; 
        } 
        
        Node temp = head;
        while(temp.next != head)
        {
        System.out.print(temp.data+" ");
        temp = temp.next;
        }
        System.out.print(temp.data);
         }
}