class Sol
{
    public static Node addOne(Node head) 
    { 
        
        head = reverse(head);  
        head = addOneUtil(head);  
        return reverse(head);  
    }
    
    static Node reverse(Node head)  
{  
    Node prev = null;  
    Node current = head;  
    Node next = null;  
    while (current != null)  
    {  
        next = current.next;  
        current.next = prev;  
        prev = current;  
        current = next;  
    }  
    return prev;  
} 

static Node addOneUtil(Node head)  
{  
    // res is head node of the resultant list  
    Node res = head;  
    Node temp = null, prev = null;  
  
    int carry = 1, sum;  
  
    while (head != null) //while both lists exist  
    {  
        // Calculate value of next digit in resultant list.  
        // The next digit is sum of following things  
        // (i) Carry  
        // (ii) Next digit of head list (if there is a  
        // next digit)  
        sum = carry + head.data;  
  
        // update carry for next calulation  
        carry = (sum >= 10)? 1 : 0;  
  
        // update sum if it is greater than 10  
        sum = sum % 10;  
  
        // Create a new node with sum as data  
        head.data = sum;  
  
        // Move head and second pointers to next nodes  
        temp = head;  
        head = head.next;  
    }  
  
    // if some carry is still there, add a new node to  
    // result list.  
    if (carry > 0)  {
        Node n= new Node(carry);  
        temp.next=n;
    }
    // return head of the resultant list  
    return res;  
}  
 
}
