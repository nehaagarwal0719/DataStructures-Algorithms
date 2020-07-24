class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here	
	int K=k;
	if(head==null) return head;
	if(k==1) return null;
	
	Node temp=head,prev=null;
	while(temp!=null && k!=1){
	    prev=temp;
	    temp=temp.next;
	    k--;
	}
	//if(prev==null) return head;
	if(temp==null) 
	prev.next=null;
	else{
	    prev.next=temp.next;
	    delete(prev.next, K);
	}
	 
	
	return head;
	
    }
}