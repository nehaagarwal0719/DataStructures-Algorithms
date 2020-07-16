void addNode(Node head, int pos, int data)
	{
		// Your code here
		Node n= new Node(data);
		Node temp=head;
		int c=0;
	
		while(temp!=null && c!=pos){
		 temp=temp.next;c++;
		}
		
        if(temp!=null){
		
		n.next=temp.next;
		n.prev=temp;
		
		if(n.next!=null)
		  n.next.prev=n;
        }
         temp.next=n;

	}