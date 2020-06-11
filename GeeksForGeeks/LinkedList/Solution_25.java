class GfG
{
    Node deleteNode(Node head, int x)
    {
	  if(head==null)
	   return null;
	   
	  Node prev=null, temp=head;
	  
	  if (temp != null && x == 1) 
        { 
            head = temp.next; // Changed head 
            return head;
        } 
	  int c=1;
	  while(temp!=null && c<x){
	      c++;
	      prev=temp;
	      temp=temp.next;
	  }
	  
	  prev.next=temp.next;
	  return head;
    }
}
