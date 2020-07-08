class GfG
{
    
    Node removeDuplicates(Node root)
    {
	  
	  Node temp=root.next;
	  Node prev=root;
	  
	  while(temp!=null){
	      if(prev.data==temp.data){
	          prev.next=temp.next;
	          temp=prev.next;
	      }
	      else{
	      prev=prev.next;
	      temp=temp.next;
	      }
	  }
	  
	  return root;
    }
}
