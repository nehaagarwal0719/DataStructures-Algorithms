class gfg
{
   long DecimalValue(Node head)
   {
 	Node temp=head;int c=0;
 	while(temp!=null){
 	    c++;temp=temp.next;
 	}
 	long res=0;
 	c=c-1;
 	//System.out.println(c);
   while(head!=null){
       res+=(Math.pow(2,c)*head.data)%1000000007;
       c--;
       head=head.next;
   }
   
   return res%1000000007;
   }
}


//better method
static int decimalValue( Node head)  
{  
    // Initialized result  
    int res = 0;  
  
    // Traverse linked list  
    while (head != null)  
    {  
        // Multiply result by 2 and add  
        // head's data  
        res = (res << 1) + (head.data?1:0);  
  
        // Move next  
        head = head.next;  
    }  
    return res;  
}  
