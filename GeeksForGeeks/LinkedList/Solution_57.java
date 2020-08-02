class gfg
{
    Node rearrangeEvenOdd(Node head)
    {
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
        odd.next = evenStart;
        return head;
     }

}
