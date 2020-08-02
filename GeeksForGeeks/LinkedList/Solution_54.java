

//https://www.geeksforgeeks.org/sum-of-two-linked-lists/ please see this its a better sol


class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        // Your code here
        
        Node res = null; // res is head node of the resultant list 
        Node prev = null; 
        Node temp = null; 
        int carry = 0, sum; 
        
      while (first != null || second != null)  
      { 
           
           sum= carry +(first!=null?first.data:0) + (second!=null?second.data:0);
           carry = (sum >= 10) ? 1 : 0; 
  
           sum = sum % 10; 
           
           temp=new Node(sum);
           
           if(res==null){
               res=temp;
           }
           else
            prev.next=temp;
            
            prev=temp;
            
            if(first!=null) first=first.next;
            if(second!=null) second=second.next;
           
             
      }        
      
       if (carry > 0) { 
            temp.next = new Node(carry); 
        } 
        
      return reverse(res);
    }
    
    static Node reverse(Node head)  
{  
    Node prev = null;  
    Node current = head;  
    Node next = null;  
    while (current != null)  
    {  
        next = current.next;  
        current.next = prev;  
        prev = current;  
        current = next;  
    }  
    return prev;  
}
}