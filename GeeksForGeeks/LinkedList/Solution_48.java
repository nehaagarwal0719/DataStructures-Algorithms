class GfG{
    public Node moveZeroes(Node head){
        //Your Code here.
        if(head==null) return null;
        
        Node temp=head.next;
        Node prev=head;
        
        while(temp!=null){
            if(temp.data==0){
                Node n=temp;
                temp=temp.next;
                prev.next=temp;
                
                n.next=head;
                head=n;
                
            }
            else{
            prev=temp;
            temp=temp.next;
            }
        }
        
        return head;
        
    }
}