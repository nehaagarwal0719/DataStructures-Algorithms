class MyStack{

    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	/* The method push to push element
	    into the stack */
    void push(int a)
	{
	    // Your code here
	    top++;
	    arr[top]=a;
	    
	} 
	
    /* The method pop which return 
      the element poped out of the stack*/
	int pop()
	{
	    if(top==-1)
	    return -1;
	    else{
	    int popped=arr[top];
        // Your code here
        top--;
        return popped;
	    }
	}
}