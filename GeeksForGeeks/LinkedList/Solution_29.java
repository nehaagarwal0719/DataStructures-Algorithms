class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            int t=temp.data;
            temp.data=temp.next.data;
            temp.next.data=t;
            temp=temp.next.next;
        }
        return head;
    }
}