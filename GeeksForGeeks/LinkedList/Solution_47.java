class LinkedList
{
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null )
          return head;
          
        Node mn=middle(head);
        Node mnext=mn.next;
        mn.next=null;
        
        Node left= sortDoubly(head);
        Node right=sortDoubly(mnext);
        Node res=merge(left,right);
        return res;  
    }
    
    static Node middle(Node head){
        if(head==null)
          return head;
        Node slow=head;
        Node fast=head;
        while( fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    static Node merge(Node a, Node b){
        
        if(a==null)
          return b;
          
        if(b==null)
          return a;
          
        Node res=null;
        
        if(a.data<=b.data){
            res=a;
            res.next=merge(a.next,b);
            res.next.prev=res;
            res.prev=null;
        }
        else{
            res=b;
            res.next=merge(a,b.next);
            res.next.prev=res;
            res.prev=null;
        }    
        
          return res;
    }
    
}