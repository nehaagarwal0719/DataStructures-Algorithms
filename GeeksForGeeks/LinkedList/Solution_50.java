class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        int m=M,n=N;
        Node temp=head;
        while(M!=1 && temp!=null){
            temp=temp.next;
            M--;
        }
        if(temp==null) return;
        //System.out.println(temp.data);
        Node prev=temp;
         while(N!=0 && temp!=null){
            temp=temp.next;
            N--;
        }
        //System.out.println(temp.data);
        if(temp==null)
        prev.next=null;
        else{
        prev.next=temp.next;
        linkdelete(prev.next,m,n);
        }
        
    }
}


