

public static int getCount(Node head)
    {
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }

    