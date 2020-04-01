int isLengthEvenorOdd(Node head1)
	{
	    int len=0;
	    while(head1!=null){
	        head1=head1.next;
	        len++;
	    }
	    if(len%2==0)
	       return 0;
	   else
	       return 1;
	}