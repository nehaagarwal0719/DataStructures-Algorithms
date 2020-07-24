class GFG
{
    static Node findIntersection(Node headA, Node headB)
    {
        if(headB==null || headA==null) return null;
        Node temp=headB;
        HashSet<Integer> hm= new HashSet<>();
        
         while(temp!=null){
            hm.add(temp.data);
            temp=temp.next;
        }
        
        Node head3=null;
        temp=headA;
        while(temp!=null){
            	if (hm.contains(temp.data)) {
			       /* Node n= new Node(temp.data);
			    	if (head3 == null) {
				    	head3 = n;
				    	head3.next=null;
			    	}
				   else 
				    	head3=insertAtEnd(temp.data,head3);*/
				    	head3=LLIntersection.append(head3, temp.data);
                }
            temp=temp.next;
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