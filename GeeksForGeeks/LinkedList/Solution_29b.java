class GFG
{
    // Should swap Kth node from beginning and 
    // Kth node from end in list and return new head.
    Node swapkthnode(Node head, int num, int K)
    {
        if(head==null) return null;
        
        Node prevX=null,tempX=head;int c=1;
        while(tempX!=null && c<K){
            prevX=tempX;
            tempX=tempX.next;
            c++;
        }
        
        Node temp=head; int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
       
        
        if(K>count) return head;
        
        int f=count-K+1,c1=1;
       // System.out.println("f"+f);
        Node prevY=null,tempY=head;
        
        while(tempY!=null && c1<f){
            prevY=tempY;
            tempY=tempY.next;
            c1++;
        }
         if(tempX==null || tempY==null) return head;
        
       // System.out.println(tempX.data+ " "+tempY.data+"he");
       
       if(prevX==null)
         head=tempY;
       else
         prevX.next=tempY;
       
       if(prevY==null)
         head=tempX;
       else
         prevY.next=tempX;     
         
       Node t= tempX.next;
       tempX.next=tempY.next;
       tempY.next=t;
            
       return head;
         
        
    }
}
