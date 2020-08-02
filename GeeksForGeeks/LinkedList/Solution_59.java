class GfG
{
    public static void rearrange(Node head)
    {
        // add your code here
          //  The task is to complete this method
        Node evenStart = head.next;
        Node odd = head;
        Node even = odd.next;
        while(even!=null && even.next!=null){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
        }
        odd.next = reverse(evenStart);
       
    }
    
     static Node reverse(Node head)  
{  
    Node prev = null;  
    Node current = head;  
    Node next = null;  
    while (current != null)  
    {  
        next = current.next;  
        current.next = prev;  
        prev = current;  
        current = next;  
    }  
    return prev;  
}
}
