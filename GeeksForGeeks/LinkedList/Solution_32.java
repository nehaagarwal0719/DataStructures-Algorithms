class Solution{
	public static Node zigZag(Node head){
        
         boolean flag = true; 
  
        // Traverse linked list starting from head. 
        Node current = head; 
        int temp=0;
        while (current != null && current.next != null) { 
            if (flag == true) /* "<" relation expected */
            { 
                /* If we have a situation like A > B > C  
            where A, B and C are consecutive Nodes  
            in list we get A > B < C by swapping B  
            and C */
                if (current.data > current.next.data) { 
                    temp = current.data; 
                    current.data = current.next.data; 
                    current.next.data = temp; 
                } 
            } 
            else /* ">" relation expected */
            { 
                /* If we have a situation like A < B < C where  
            A, B and C are consecutive Nodes in list we  
            get A < C > B by swapping B and C */
                if (current.data < current.next.data) { 
                    temp = current.data; 
                    current.data = current.next.data; 
                    current.next.data = temp; 
                } 
            } 
  
            current = current.next; 
  
            /* flip flag for reverse checking */
            flag = !(flag); 
            
        }
        return head;
    }
}