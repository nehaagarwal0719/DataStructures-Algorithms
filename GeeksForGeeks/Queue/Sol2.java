class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}

	void push(int a)
	{
	   
	    arr[rear]=a;
	    rear++;
	} 

   
	int pop()
	{
	
		if(front==rear){
		    front=rear=0;
		   return -1;
		}
		 int popped=arr[front];
		 front++;
		 return popped;
	} 
}
