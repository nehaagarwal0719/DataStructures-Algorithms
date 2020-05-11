class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> hs = new HashSet<>();
         Node temp=head;
         Node prev=null;
         while(temp!=null){
             if(!hs.contains(temp.data)){
                 hs.add(temp.data);
                 prev=temp;
             }     

             else
                 prev.next=temp.next;
             temp=temp.next;         
         }
      
          return head;     
    }
}