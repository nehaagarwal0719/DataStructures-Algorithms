class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	if(head==null)
	 return true;
	 
	 Node temp=head.next;
	 
	 while(temp!=head && temp!=null){
	     temp=temp.next;
	 }
	 
	 return (temp==head);
    }
}