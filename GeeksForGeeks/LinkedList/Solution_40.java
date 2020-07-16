class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	if(head==null) return null;
	
    Node temp=head;int c=1;
	while(temp!=null && c!=x){
	  temp=temp.next;c++;
	}
	  
	if(temp==null) return head; 
	
	if(head==temp)
	  head=temp.next;
	  
	  
	if(temp.next!=null)
	temp.next.prev=temp.prev;
	
	if(temp.prev!=null)
	 temp.prev.next=temp.next;
	 
	return head; 
	
    }
}
