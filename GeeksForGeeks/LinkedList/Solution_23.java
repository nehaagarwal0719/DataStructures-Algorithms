class GFG {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node temp=head;
        Node prev=null;
        Node n = new Node(key);
        
        if(head==null|| head.data>=key){
            n.next=head;
            head=n;
            return head;
        }
        else{  
        while(temp!=null && temp.data<key){
            prev=temp;
            temp=temp.next;
        }
        
        prev.next=n;
        n.next=temp;
    
        return head;
        }
    }
}