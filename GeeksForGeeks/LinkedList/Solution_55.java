class GFG
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        //Add your code here.
        if(p1==null) return p2;
        if(p2==null) return p1;
        if(p1==null && p2==null) return null;
        Node res=null,prev=null,temp=null;
        while(p1!=null && p2!=null){
            if(p1.pow>p2.pow){
                temp= new Node(p1.coeff,p1.pow);
                if(res==null) res=temp;
                else prev.next=temp;
                p1=p1.next;
            }
            
            else if(p1.pow<p2.pow){
                temp= new Node(p2.coeff,p2.pow);
                if(res==null) res=temp;
                else prev.next=temp;
                p2=p2.next;
            }
            else{
                 temp= new Node(p2.coeff+p1.coeff,p2.pow);
                if(res==null) res=temp;
                else prev.next=temp;
                p2=p2.next;
                p1=p1.next;
            }
            prev=temp;
        }
        
        while(p1!=null || p2!=null){
            
            if(p1!=null){
                temp= new Node(p1.coeff,p1.pow);
                if(res==null) res=temp;
                else prev.next=temp;
                p1=p1.next;
            }
            
            if(p2!=null){
                 temp= new Node(p2.coeff,p2.pow);
                if(res==null) res=temp;
                else prev.next=temp;
                p2=p2.next;
            }
            
            prev=temp;
        }
        return res;
    }
}