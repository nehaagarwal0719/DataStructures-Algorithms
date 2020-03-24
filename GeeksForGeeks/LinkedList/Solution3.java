class Solution {
    
    public void deleteAlternate (Node head){
    
    if (head == null)  
        return;  
  
    Node node = head.next;  
  
    if (node == null) { 
    System.out.print(head.data + " ");
        return;  
    }    
  
    System.out.print(head.data + " ");
       
    head.next = node.next;  
 
    deleteAlternate(head.next);  
    }
}