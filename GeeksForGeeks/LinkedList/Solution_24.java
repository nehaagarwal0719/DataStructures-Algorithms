//Function should return the length of the loop in LL.
class Loop
{
    int countNodesinLoop(Node head)
    {
	  
	    if(head==null)
	     return 0;
	    Node slow=head,fast=head;int c=1;
	    while(slow!=null && fast!=null && fast.next!=null){
	        slow=slow.next;
	        fast=fast.next.next;
	        if(slow==fast){
	            Node temp=slow;
	            while(temp.next!=slow){
	                c++;
	                temp=temp.next;
	            }
	            return c; 
	        }
	    }
	    return 0;
    }
}