class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node head3 = null;
		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
			    Node n= new Node(head1.data);
				if (head3 == null) {
					head3 = n;
					//head3 = llist3.head;
				} else {
					head3=insertAtEnd(head2.data,head3);
				}
				head1 = head1.next;
				head2 = head2.next;
			} else if (head1.data < head2.data) {
				head1 = head1.next;
			} else {
				head2 = head2.next;
			}
		}  
		return head3;
    }
    static Node  insertAtEnd(int x, Node head)
	{
	    // Your code here
	    Node n= new Node(x);   
         
	    Node temp=head;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    
	    n.next=null;
	    temp.next=n;
        return head;
	}
}