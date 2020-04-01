class LList
{
    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    Node n= new Node(x);
	    n.next=head;
	    head=n;
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    // Your code here
	    Node n= new Node(x);   
	     
	    if (head == null) { 
        head = new Node(x); 
        return; 
        } 
         
	    Node temp=head;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    
	    n.next=null;
	    temp.next=n;

	}
	
	// Please do not delete this
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }