class GfG
{
    public static int nknode(Node head, int k)
    {
       if (k <= 0 || head == null) 
            return 0; 
  
        Node fractionalNode = null; 
  
        // Traverse the given list 
        int i = 0; 
        for (Node temp = head; temp != null; 
                          temp = temp.next){ 
  
            if (i % k == 0){ 
                if (fractionalNode == null) 
                    fractionalNode = head; 
                else
                    fractionalNode = fractionalNode.next; 
            } 
            i++; 
        } 
        return fractionalNode.data; 
    }
}