class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        Node current; 
        Node newNode= new Node(x);
            // if list is empty  
            if (head == null) 
                head = newNode;  
  
            // if the node is to be inserted at the beginning  
            // of the doubly linked list  
            else if (head.data >= newNode.data) 
            { 
                newNode.next = head; 
                head.prev = newNode; 
                head = newNode; 
            } 
  
            else 
            { 
                current = head; 
  
                // locate the node after which the new node  
                // is to be inserted  
                while (current.next != null &&  
                        current.next.data < newNode.data)  
                    current = current.next; 
  
                /* Make the appropriate links */
                newNode.next = current.next; 
                newNode.prev = current;  
                // if the new node is not inserted  
                // at the end of the list 
                if (current.next != null)  
                    newNode.next.prev = newNode;  
  
                current.next = newNode; 
                
              
            } 
            return head; 
    }
}