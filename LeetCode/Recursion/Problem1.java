class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        else{
            int data;
            data=head.val;
            head.val=head.next.val;
            head.next.val=data;
            swapPairs(head.next.next);
        }
        return head;
    }
}
