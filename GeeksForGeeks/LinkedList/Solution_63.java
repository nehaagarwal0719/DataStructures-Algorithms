class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
       Node ptr=head;
       while(ptr.next!=head)
       ptr=ptr.next;
       
       Node prev=ptr;
       ptr=head;
       
       if(head.data==d){
           prev.next=head.next;
           return prev.next;
       }
       
       while(ptr.next!=head){
           
           if(ptr.data==d){
               prev.next=ptr.next;
               break;
           }
           prev=ptr;
           ptr=ptr.next;
       }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        if (head== null)  
        return null;  
  
    // reverse procedure same as reversing a  
    // singly linked list  
    Node prev = null;  
    Node current = head;  
    Node next;  
    do 
    {  
        next = current.next;  
        current.next = prev;  
        prev = current;  
        current = next;  
    } while (current != head);  
  
    // adjutsing the links so as to make the  
    // last node point to the first node  
    head.next = prev;  
    head = prev;  ; 
        return head;
    }
}