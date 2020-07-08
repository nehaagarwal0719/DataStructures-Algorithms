class Solution {
    public int detectLoop(Node head) {
        
        Node slowptr=head,fastptr=head;
        int f=1;
        
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr){
                return 1;
            }
        }
     return 0;   
    }
}