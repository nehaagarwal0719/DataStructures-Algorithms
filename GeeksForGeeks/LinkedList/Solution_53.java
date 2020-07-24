public static int moduarNode(Node head, int k)
    {
        // add your code here
        if (k <= 0 || head == null) 
            return -1; 
  
        Node fractionalNode = null; 
  
        // Traverse the given list 
        int i = 1; 
        for (Node temp = head; temp != null; 
                          temp = temp.next){ 
  
            if (i % k == 0){ 
                    fractionalNode = temp; 
            } 
            i++; 
        } 
        if(fractionalNode!=null)
         return fractionalNode.data; 
        return -1; 
    }