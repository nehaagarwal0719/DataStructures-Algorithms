Node findUnion(Node head1,Node head2)
	{
	  
	    TreeSet<Integer> hs = new TreeSet<>();
	    Node res=null;
	    
	    while(head1!=null ){
	     hs.add(head1.data);
	     head1=head1.next;
	    } 
	    
	    while(head2!=null ){
	     hs.add(head2.data);
	     head2=head2.next;
	    } 
	    
	     TreeSet<Integer> hs1 = (TreeSet<Integer>)hs.descendingSet();
	     
	     for (Integer i : hs1)  {
	        Node temp=new Node(i);
	        temp.next=res;
	        res=temp;
	        
	     }
	     
	    
	   return res;
	    
	    
	    
	}
