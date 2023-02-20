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


public static boolean detectLoop(Node head){
        // Add code here
       HashSet<Node> hs = new HashSet<Node>();
       while(head!=null){
           if(hs.contains(head))
           return true;
           
           hs.add(head);
           head=head.next;
       }
       return false;
    }


Time and space - O(n)
