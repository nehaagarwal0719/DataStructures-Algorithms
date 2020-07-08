class GfG
{
    Node deleteAllOccurances(Node head, int x)
    {
        if(head==null) return null;
        
        Node temp=head,prev=null;
        
        if(temp!=null && temp.data==x ){
            head=temp.next;
            temp=head;
        }
        
        while(temp!=null){
            if(temp.data==x){
                prev.next=temp.next;
                temp=temp.next;
            }
            else{
            prev=temp;
            temp=temp.next;
            }
        }
        
        return head;
    }
}