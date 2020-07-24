class Solution {
    boolean isVowel(char x)  
       {  
    return (x == 'a' || x == 'e' || x == 'i' ||  
            x == 'o' || x == 'u');  
       }
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        if(head==null) return null;
        
         Node latestVowel,newHead=head;  
  
         Node curr = head;  
         
         if(isVowel(head.data))
           latestVowel=head;
          else
          {
            while (curr.next != null &&  !isVowel(curr.next.data))  
                curr = curr.next;  
                
            if(curr.next==null) return head;
            
            latestVowel=newHead=curr.next;
            curr.next=curr.next.next;
            latestVowel.next=head;
          }
          
         while(curr!=null && curr.next!=null){
              if (isVowel(curr.next.data) == true)  
               {
                    if (curr == latestVowel)  
                      {  
                        latestVowel = curr = curr.next;  
                      }  
                    else{
                        Node temp=latestVowel.next;
                        latestVowel.next = curr.next; 
                         latestVowel = latestVowel.next;  

                        curr.next = curr.next.next;
                        latestVowel.next = temp;
                    }  
               }
               else curr=curr.next;
         }
         return newHead;
    }
}