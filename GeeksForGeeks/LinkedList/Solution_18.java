class GfG
{
    
    int getNthFromLast(Node head, int n)
    {
    		Node temp=head;
    		int len=0;
    		while(temp!=null){
    		    len++;
    		    temp=temp.next;
    		}
    		
    		if(n>len)
    		 return -1;
    	    
    	    temp=head;
    	    
    		 for (int i = 1; i < len - n + 1; i++) 
                 temp = temp.next; 
                 
             return temp.data;         
    }
}