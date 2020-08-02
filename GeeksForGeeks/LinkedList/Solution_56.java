
// M-2 using hashing - better 
Time Complexity:  O(n)
Auxiliary Space:  O(n)



class Clone {
    Node copyList(Node head) {
        // your code here
        
        Node orig=head, clone=null;
        
        HashMap<Node,Node> map= new HashMap<>();
        Node head1=clone;
        while(orig!=null){
            clone= new Node(orig.data);
            map.put(orig, clone);
            orig=orig.next;
        }
        
        orig=head;
        
        while(orig!=null){
            clone=map.get(orig);
            clone.next=map.get(orig.next);
            clone.arb=map.get(orig.arb);
            orig=orig.next;
        }
        
        return map.get(head); 
    }
}




// M-1 (better)  (N0 NEED TO SEE THIS)

1) Create all nodes in copy linked list using next pointers.
2) Store the node and its next pointer mappings of original linked list.
3) Change next pointer of all nodes in original linked list to point to the corresponding node in copy linked list.
4) Change the arbit pointer of all nodes in copy linked list to point to corresponding node in original linked list.
5) Now construct the arbit pointer in copy linked list as below and restore the next pointer of nodes in the original linked list.
   copy_list_node->arbit =
                      copy_list_node->arbit->arbit->next;
       copy_list_node = copy_list_node->next; 
6) Restore the next pointers in original linked list from the stored mappings(in step 2).

Time Complexity:  O(n)
Auxiliary Space:  O(n)


video explanation - https://www.youtube.com/watch?v=EHpS2TBfWQg


//M-3  
Time Complexity:  O(n)
Auxiliary Space:  0(1)

https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/
can see back to back swe but couldnt understand 
this code failed
/*Node orig=head, clone=null;
        
        //HashMap<Node,Node> map= new HashMap<>();
        Node head1=clone;
        while(orig!=null){
            clone= new Node(orig.data);
            orig.next=clone; 
            clone.next=orig.next;
         
            orig=clone;
        }
        
        orig=head;
        
        while(orig!=null){
            orig.next.arb=orig.arb.arb.next; 
            
            orig=orig.next.next;
        }
        
        return head1; 

*/x


