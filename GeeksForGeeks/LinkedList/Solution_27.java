
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	    Node one=mergeSort(node1);
	    Node two=mergeSort(node2);
	    return merge(one,two);
    }
    
    static Node mergeSort(Node head)
    {
        
        if(head==null || head.next==null )
          return head;
          
        Node mn=middle(head);
        Node mnext=mn.next;
        mn.next=null;
        
        Node left= mergeSort(head);
        Node right=mergeSort(mnext);
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
        
        if(a.data>=b.data){
            res=a;
            res.next=merge(a.next,b);
        }
        else{
            res=b;
            res.next=merge(a,b.next);
        }    
        
          return res;
    }
}
